package com.SpringBootNivell2.service.interfaz;

import com.SpringBootNivell2.dto.UserResponseDto;

public interface IUserService {
		
	UserResponseDto getUser(String uuid);
}


