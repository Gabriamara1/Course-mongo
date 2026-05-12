    package com.gabrielamaral.mongoDB.resources.exception;

import com.gabrielamaral.mongoDB.domain.Post;
import com.gabrielamaral.mongoDB.domain.User;
import com.gabrielamaral.mongoDB.dto.UserDTO;
import com.gabrielamaral.mongoDB.services.UserService;
import com.gabrielamaral.mongoDB.services.exception.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);

        return ResponseEntity.ok().body(obj);

    }

}