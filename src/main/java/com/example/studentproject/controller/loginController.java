//package com.example.studentproject.controller;
//
//import com.example.studentproject.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.util.DigestUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//@Controller
//public class loginController {
//    @Autowired
//    private UserRepository userRepo;
//
//    @GetMapping("/")
//    public String showLogin() {
//        return "loginForm";
//    }
//    @GetMapping("/login")
//    public String showiLogin() {
//        return "loginForm";
//    }
//
//    @PostMapping("/login")
//    public String doLogin(@ModelAttribute User user, Model model) {
//
//        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
//        User usr=userRepo.findByUsernameAndPasswoßßrd(user.getUsername(), user.getPassword());
//        if(usr !=null) {
//            model.addAttribute("uname",user.getUsername());
//
//            return"home";
//        }
//        model.addAttribute("message","user not found !!");
//        return"loginForm";
//    }
//
//
//
//
//
//}
