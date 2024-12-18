package org.gabriel.workshopmongo.services;

import org.gabriel.workshopmongo.domain.User;
import org.gabriel.workshopmongo.repository.UserRepository;
import org.gabriel.workshopmongo.services.exception.ObjectNotFoundExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();

    }

    public User findById(String id){
        User user = userRepository.findById(id).get();
        if (user == null){
            throw new ObjectNotFoundExecption("Objeto não encontrado");
        }
        return user;
    }

}
