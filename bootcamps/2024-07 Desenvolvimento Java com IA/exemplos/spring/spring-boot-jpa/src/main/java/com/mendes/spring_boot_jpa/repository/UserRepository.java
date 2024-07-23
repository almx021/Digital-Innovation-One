package com.mendes.spring_boot_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mendes.spring_boot_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    // Query Method
    User findByName(String name);

    // Query Method
    List<User> findByNameContaining(String name);

    // Query Override
    @Query("SELECT u from User u WHERE u.name LIKE %:name%")
    List<User> filterByName(@Param("name") String name);
}
