package com.SpringBootNivell2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootNivell2.dto.UserResponseDto;
import com.SpringBootNivell2.repository.UserRepository;
import com.SpringBootNivell2.service.interfaz.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserResponseDto getUser(String uuid) {
		return userRepository.getUser(uuid);
	}

}
