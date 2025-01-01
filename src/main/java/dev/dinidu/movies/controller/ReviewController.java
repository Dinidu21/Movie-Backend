package dev.dinidu.movies.controller;

import dev.dinidu.movies.model.ReviewModel;
import dev.dinidu.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @PostMapping()
    public ResponseEntity<ReviewModel> createReview(@RequestBody Map<String, String> payload) {

        return new ResponseEntity<ReviewModel>(service.createReview
                (payload.get("reviewBody"), payload.get("imdbId")),
                HttpStatus.OK);
    }
}