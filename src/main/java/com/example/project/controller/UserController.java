package com.example.project.controller;


import com.example.project.model.User;
import org.springframework.web.bind.annotation.*;

/*mysql user user
password password*/
@RestController
@RequestMapping("/user")
public class UserController {

    User user;

    @GetMapping("{userId}")
    public User getUserInfo() {

        return user;
        //new User(0, "name", "email", "password", 0);

    }

    @PostMapping("/register")
    public String createUserDetails(@RequestBody User user) {

        this.user = user;
        return ("User details inputted successfully");


    }

    @PostMapping("/logIn")
    public String logIn(@RequestBody User user) {

        this.user = user;
        return ("Logged In Successfully");

    }

    @PutMapping("/update")
    public String updateUserDetails(@RequestBody User user) {

        this.user = user;
        return ("User details updated successfully");


    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails() {

        this.user = null;
        return ("User details deleted successfully");


    }

}
