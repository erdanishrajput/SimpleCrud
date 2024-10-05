package com.main.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Rolename;
	
	private String roleType;

	
}
