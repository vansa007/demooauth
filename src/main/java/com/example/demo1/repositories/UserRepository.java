package com.example.demo1.repositories;

import com.example.demo1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Access to the user data. JpaRepository grants us convenient access methods here.
 */
public interface UserRepository extends JpaRepository<User, Long> {


    /**
     * Find a user by username
     *
     * @param username the user's username
     * @return user which contains the user with the given username or null.
     */
    User findOneByUsername(String username);

}

