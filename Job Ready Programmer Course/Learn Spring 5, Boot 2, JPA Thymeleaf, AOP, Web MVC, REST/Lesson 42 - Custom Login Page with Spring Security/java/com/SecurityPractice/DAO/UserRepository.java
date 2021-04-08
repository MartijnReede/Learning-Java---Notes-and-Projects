package com.SecurityPractice.DAO;

import org.springframework.data.repository.CrudRepository;

import com.SecurityPractice.Entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
