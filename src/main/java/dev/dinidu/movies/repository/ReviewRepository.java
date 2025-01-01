package dev.dinidu.movies.repository;

import dev.dinidu.movies.model.ReviewModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewModel, String> {
}
