package com.example.studentproject;

import com.example.studentproject.auth.AuthenticationService;
import com.example.studentproject.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static com.example.studentproject.security.Role.ADMIN;
import static com.example.studentproject.security.Role.USER;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class StudentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var user = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(USER)
                    .build();
            System.out.println("Manager token: " + service.register(user).getAccessToken());

        };
    }
}
