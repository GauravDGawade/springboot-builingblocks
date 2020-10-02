package com.stacksimplify.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.entities.User1;

//repository
@Repository
public interface UserRepository extends JpaRepository<User1, Long>{

	User1 findByUsername(String username);
}
