package dev.dinidu.movies.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class ReviewModel {
    @Id
    private ObjectId id;
    private String body;

    public ReviewModel() {
    }

    public ReviewModel(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public ReviewModel setBody(String body) {
        this.body = body;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public ReviewModel setId(ObjectId id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "ReviewModel{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
