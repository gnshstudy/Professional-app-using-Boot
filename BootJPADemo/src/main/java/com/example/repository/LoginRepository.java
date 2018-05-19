package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.modal.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

}
