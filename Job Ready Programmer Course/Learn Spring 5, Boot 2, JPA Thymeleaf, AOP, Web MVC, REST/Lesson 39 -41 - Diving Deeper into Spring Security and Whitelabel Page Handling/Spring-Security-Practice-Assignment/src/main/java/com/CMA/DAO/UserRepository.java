package com.CMA.DAO;

import org.springframework.data.repository.CrudRepository;
import com.CMA.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
