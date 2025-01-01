package dev.dinidu.movies.service;

import com.mongodb.client.result.UpdateResult;
import dev.dinidu.movies.model.MovieModel;
import dev.dinidu.movies.model.ReviewModel;
import dev.dinidu.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public ReviewModel createReview(String reviewBody, String imdbId) {
        // Insert the new review into the reviews collection
        ReviewModel review = repository.insert(new ReviewModel(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        // Update the movie document by pushing the review ID into the reviewIds array
        UpdateResult result = mongoTemplate.update(MovieModel.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first(); // Use first() to update only the first matched document

        // Check the result of the update operation
        if (result.getMatchedCount() == 0) {
            System.out.println("No movie found with imdbId " + imdbId);
        } else if (result.getModifiedCount() == 0) {
            System.out.println("Movie found, but review ID was not added.");
        } else {
            System.out.println("Review " + review.getId() + " added for movie " + imdbId);
        }

        return review;
    }

}