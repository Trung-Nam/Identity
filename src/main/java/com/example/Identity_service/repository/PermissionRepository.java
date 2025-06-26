package com.example.Identity_service.repository;

import com.example.Identity_service.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
    // Additional query methods can be defined here if needed
}
