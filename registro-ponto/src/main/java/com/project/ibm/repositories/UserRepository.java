package com.project.ibm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ibm.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
	
	User findbyEmail(String email);

}
