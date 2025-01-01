package dev.dinidu.movies.model;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")

public class ReviewModel {
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    public ReviewModel(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    public ReviewModel(LocalDateTime updated, LocalDateTime created, String body, ObjectId id) {
        this.updated = updated;
        this.created = created;
        this.body = body;
        this.id = id;
    }

    public ReviewModel() {
    }

    public ObjectId getId() {
        return id;
    }

    public ReviewModel setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public ReviewModel setUpdated(LocalDateTime updated) {
        this.updated = updated;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public ReviewModel setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getBody() {
        return body;
    }

    public ReviewModel setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return "ReviewModel{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}