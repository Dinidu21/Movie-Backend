package dev.dinidu.movies.service;

import dev.dinidu.movies.model.MovieModel;
import dev.dinidu.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<MovieModel> findAllMovies() {
        return movieRepository.findAll();
    }
}
