//Handles database operations.

package com.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.Entities.UserEntitites;

public interface UserRepo extends JpaRepository<UserEntitites, Integer> {

	
}
