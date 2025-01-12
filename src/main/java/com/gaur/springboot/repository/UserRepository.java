package com.gaur.springboot.repository;

import com.gaur.springboot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);
}
