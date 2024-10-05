// Handles HTTP requests and communicates with the service layer.

package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.Dto.UserDto;
import com.main.Service.UserService;

@RestController("/user")
@RequestMapping
public class UserController {

	@Autowired
	public UserService userService;
	
	// Controller methods
	
	@PostMapping("/save")
	public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
		return new ResponseEntity<UserDto>(userDto , HttpStatus.OK);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<String> update(@RequestBody @RequestParam("userId") UserDto userDto , Integer userId){
	String response =  userService.updateById(userDto, userId);
	return ResponseEntity.ok(response);
			
	}
	
	@GetMapping("/{/userId}")
	public ResponseEntity<UserDto> getUser(@RequestBody @RequestParam("userId") Integer id){
		return new ResponseEntity<UserDto>(userService.getById(id), HttpStatus.OK);
	}
	
	
}
