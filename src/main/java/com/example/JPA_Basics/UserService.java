package com.example.JPA_Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }
    public List<User> getAlluser(){
        return userRepository.findAll();
    }
    public User getUserById(int id){
        return userRepository.findById(id).get();
    }
    public String deleteAllUser(){
        userRepository.deleteAll();
        return "All users deleted";
    }
    public String deleteById(int id){
        if(userRepository.existsById(id)){
            String name = userRepository.findById(id).get().getName();
            userRepository.deleteById(id);
            return name+" with ID "+id+" is deleted";
        }
        return "No user exist with Id "+id;
    }
    public String updateName(int id, String name){
        if(userRepository.existsById(id)){
            userRepository.findById(id).get().setName(name);
            userRepository.save(userRepository.findById(id).get());
            return "Name is updated";
        }
        return "User with Id "+id+" does not exist";
    }
}
