package com.main.translator;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.Dto.UserDto;
import com.main.Entities.UserEntitites;

import jakarta.persistence.Entity;

@Component
public class UserTranslator {

	@Autowired
	private ModelMapper modelMapper;
	
	
	public UserDto translateUserEntityToUserDto(UserEntitites userEntity) {
		return modelMapper.map(userEntity, UserDto.class);
	}
	public UserEntitites translateUserDtoToUserEntitites(UserDto userDto) {
		return modelMapper.map(userDto, UserEntitites.class);
	}
	
	public List<UserDto> TranslateAllUserEntittyToDto(List<UserEntitites> userEntity) {
	List<UserDto> list = new ArrayList<UserDto>();
	userEntity.forEach( Entity -> {
		list.add(modelMapper.map(Entity, UserDto.class));
	});
	return list;
		
	}
}
