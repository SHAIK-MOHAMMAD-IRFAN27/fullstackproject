package com.enum3rate3.studentfeeservice.service;

import com.enum3rate3.studentfeeservice.config.JwtProvider;
import com.enum3rate3.studentfeeservice.model.User;
import com.enum3rate3.studentfeeservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements  UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findUserProfileByJwt(String jwt) throws Exception {
        String email= JwtProvider.getEmailFromJwtToken(jwt);
        User user = userRepo.findByEmail(email);

        if(user==null) {
            throw new Exception("user not exist with email "+email);
        }
        return user;
    }

    @Override
    public User findUserByEmail(String username) throws Exception {
        User user=userRepo.findByEmail(username);
        if(user!=null) {
            return user;
        }
        throw new Exception("user not exist with username "+username);
    }

    @Override
    public User findUserById(Long userId) throws Exception {
        Optional<User> opt = userRepo.findById(userId);
        if(opt.isEmpty()) {
            throw new Exception("user not found with id "+userId);
        }
        return opt.get();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
}