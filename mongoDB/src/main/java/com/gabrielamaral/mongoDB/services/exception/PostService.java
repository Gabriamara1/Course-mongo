package com.gabrielamaral.mongoDB.services.exception;

import com.gabrielamaral.mongoDB.domain.Post;
import com.gabrielamaral.mongoDB.domain.User;
import com.gabrielamaral.mongoDB.dto.UserDTO;
import com.gabrielamaral.mongoDB.repository.PostRepository;
import com.gabrielamaral.mongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(()-> new RuntimeException("Usuário não encontrado."));
    }

  public List<Post> findByTitle(String text) {
        return repo.findByTitle(text);
  }
}
