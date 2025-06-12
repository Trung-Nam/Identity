package com.example.Identity_service.repository;

import com.example.Identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    boolean existsUserByUsername(String username);
    Optional<User> findByUsername(String username);
}
