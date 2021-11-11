package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.login;


public interface loginRepository extends JpaRepository<login, Integer> {

}
