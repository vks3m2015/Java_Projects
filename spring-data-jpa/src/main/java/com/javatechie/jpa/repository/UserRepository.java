package com.javatechie.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
