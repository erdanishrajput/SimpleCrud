package com.main.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Dao.UserDao;
import com.main.Dto.UserDto;
import com.main.Entities.UserEntitites;
import com.main.Service.UserService;
import com.main.translator.UserTranslator;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserTranslator userTranslator;
	
	@Autowired
	public UserDao userDao;
	
	@Override
	public UserDto save(UserDto userDto) {
	// Convert DTO to Entity
	UserEntitites entitites = userDao.save(userTranslator.translateUserDtoToUserEntitites(userDto));
	 // Convert the saved entity back to DTO
	return userTranslator.translateUserEntityToUserDto(entitites);
	}

	@Override
	public UserDto getById(Integer id) {
		return userTranslator.translateUserEntityToUserDto(userDao.getById(id));
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return userTranslator.TranslateAllUserEntittyToDto(userDao.getAllUser());
	}

	@Override
	public String updateById(UserDto userDto, Integer id) {
		UserEntitites entitites = userDao.getById(id);
		
		entitites.setEmail(userDto.getEmail());
		entitites.setName(userDto.getName());
		entitites.setLastname(userDto.getLastname());
		entitites.setMobile(userDto.getMobile());
		
		userDao.save(entitites);
		
		return "updated";
	}

	@Override
	public String deleteById(Integer id) {
		
		return userDao.deleteById(id);
	}

}
