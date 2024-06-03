package com.example.studentproject.repository;


import com.example.studentproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsernameAndPassword(String un, String psw);



}
