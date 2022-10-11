package com.example.spring_security_jpa_mysql.dao;

import com.example.spring_security_jpa_mysql.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsername(@Param("username") String username);
}
