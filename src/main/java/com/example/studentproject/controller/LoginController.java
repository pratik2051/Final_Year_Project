package com.example.studentproject.controller;

import com.example.studentproject.model.User;
import com.example.studentproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class LoginController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String showLogin() {
        return "index";
    }
    @GetMapping("/login")
    public String showiLogin() {
        return "loginForm";
    }

//    @PostMapping("/login")
//    public String doLogin(@ModelAttribute User user, Model model) {

//        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
//        User usr=userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//        if(usr !=null) {
//            model.addAttribute("uname",user.getUsername());
//
//            return"home";
//        }
//        model.addAttribute("message","user not found !!");
//        return"loginForm";
//    }





}
