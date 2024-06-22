//package com.example.studentproject.controller;
//
//import com.example.studentproject.repository.UserRepository;
//import io.swagger.v3.oas.annotations.Hidden;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//public class LoginController {
//    @Autowired
//    private UserRepository userRepo;
//
//    @GetMapping("/login")
//    public String showLogin() {
//        return "index";
//    }
//    @GetMapping("/signup")
//    public String Signup() {
//        return "loginForm";
//    }
//
////    @PostMapping("/login")
////    public String doLogin(@ModelAttribute User user, Model model) {
//
////        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
////        User usr=userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
////        if(usr !=null) {
////            model.addAttribute("uname",user.getUsername());
////
////            return"home";
////        }
////        model.addAttribute("message","user not found !!");
////        return"loginForm";
////    }
//
//
//    @RestController
//    @RequestMapping("/api/v1/admin")
//    @PreAuthorize("hasRole('ADMIN')")
//    public static class AdminController {
//
//        @GetMapping
//        @PreAuthorize("hasAuthority('admin:read')")
//        public String get() {
//            return "GET:: admin controller";
//        }
//        @PostMapping
//        @PreAuthorize("hasAuthority('admin:create')")
//        @Hidden
//        public String post() {
//            return "POST:: admin controller";
//        }
//        @PutMapping
//        @PreAuthorize("hasAuthority('admin:update')")
//        @Hidden
//        public String put() {
//            return "PUT:: admin controller";
//        }
//        @DeleteMapping
//        @PreAuthorize("hasAuthority('admin:delete')")
//        @Hidden
//        public String delete() {
//            return "DELETE:: admin controller";
//        }
//    }
//
//    @RestController
//    @RequestMapping("/api/v1/demo-controller")
//    @Hidden
//    public static class DemoController {
//
//      @GetMapping
//      public ResponseEntity<String> sayHello() {
//        return ResponseEntity.ok("Hello from secured endpoint");
//      }
//
//    }
//}
