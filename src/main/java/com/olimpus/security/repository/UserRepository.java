package com.olimpus.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olimpus.security.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	// Since email is unique, we'll find users by email
	Optional<User> findByEmail(String email);
}
