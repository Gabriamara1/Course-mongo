package com.gabrielamaral.mongoDB.services;

import com.gabrielamaral.mongoDB.domain.User;
import com.gabrielamaral.mongoDB.dto.UserDTO;
import com.gabrielamaral.mongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ext.javatime.ser.DurationSerializer;

import java.util.List;
import java.util.Optional;

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

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(()-> new RuntimeException("Usuário não encontrado."));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
