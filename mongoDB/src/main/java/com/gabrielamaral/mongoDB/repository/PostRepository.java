package com.gabrielamaral.mongoDB.repository;

import com.gabrielamaral.mongoDB.domain.Post;
import com.gabrielamaral.mongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
