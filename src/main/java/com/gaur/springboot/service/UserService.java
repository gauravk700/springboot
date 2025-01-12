package com.gaur.springboot.service;

import com.gaur.springboot.model.Users;
import com.gaur.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<Users> getAllUsers(){
        return userRepo.findAll();
    }

    public Users createUser(Users user){
        return userRepo.save(user);
    }
}
