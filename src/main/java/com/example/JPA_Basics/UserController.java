package com.example.JPA_Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //Add new users
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

     //get all the users
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAlluser();
    }

    //get user with particular id
    @GetMapping("/getById")
    public User getUserByID(@RequestParam("id") int id){
        return userService.getUserById(id);
    }
    //Delete all the users
    @DeleteMapping("/deleteAll")
    public String deleteAllUser(){
        return userService.deleteAllUser();
    }
    //Delete user by its id
    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam("id")int id){
        return userService.deleteById(id);
    }
    //update the name of user with particular user
    @PutMapping("/updateName")
    public String updateName(@RequestParam("id")int id, @RequestParam("name")String name){
        return userService.updateName(id,name);
    }
}












