package com.gabrielamaral.mongoDB.services;

import com.gabrielamaral.mongoDB.domain.User;
import com.gabrielamaral.mongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ext.javatime.ser.DurationSerializer;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

}
