package com.gabrielamaral.mongoDB.services;

import com.gabrielamaral.mongoDB.domain.User;
import com.gabrielamaral.mongoDB.dto.UserDTO;
import com.gabrielamaral.mongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

    public void delete (String id) {
        repo.deleteById(id);

    }

    public User update(User obj) {
        User newObj = repo.findById(obj.getId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }


    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }


}
