package dev.dinidu.movies.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
public class MovieModel {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference
    private List<ReviewModel> reviews;

    public MovieModel(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }

    public MovieModel() {
    }

    public MovieModel(List<ReviewModel> reviews, List<String> genres, List<String> backdrops, String poster, String trailerLink, String releaseDate, String title, String imdbId, ObjectId id) {
        this.reviews = reviews;
        this.genres = genres;
        this.backdrops = backdrops;
        this.poster = poster;
        this.trailerLink = trailerLink;
        this.releaseDate = releaseDate;
        this.title = title;
        this.imdbId = imdbId;
        this.id = id;
    }

    public List<ReviewModel> getReviews() {
        return reviews;
    }

    public MovieModel setReviews(List<ReviewModel> reviews) {
        this.reviews = reviews;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public MovieModel setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public MovieModel setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
        return this;
    }

    public List<String> getGenres() {
        return genres;
    }

    public MovieModel setGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public MovieModel setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public MovieModel setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public MovieModel setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MovieModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImdbId() {
        return imdbId;
    }

    public MovieModel setImdbId(String imdbId) {
        this.imdbId = imdbId;
        return this;
    }
}