package com.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.Entities.UserRole;

public interface UserRoleRepo extends JpaRepository<UserRole, Integer> {


}
