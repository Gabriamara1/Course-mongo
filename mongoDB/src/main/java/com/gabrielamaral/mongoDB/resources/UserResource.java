package com.gabrielamaral.mongoDB.resources;

import com.gabrielamaral.mongoDB.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User gabrielAmaral = new User("1", "Gabriel Amaral", "gabriel@gmail.com");
        User maria = new User("2", "maria", "maria@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(gabrielAmaral, maria));
        return  ResponseEntity.ok().body(list);
    }
}
