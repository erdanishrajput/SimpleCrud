package com.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.Dto.UserDto;


public interface UserService {

	public UserDto save(UserDto userDto);
	
	public UserDto getById(Integer id);
	
	public List<UserDto> getAllUser();
	
	public String updateById(UserDto userDto,Integer Id);
	
	public String deleteById(Integer id);
	
	
}
