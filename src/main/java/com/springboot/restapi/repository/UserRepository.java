package com.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
