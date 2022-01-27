package com.SpringBootNivell2.repository;

import com.SpringBootNivell2.dto.ResponseDto;

public interface IRepository {
	
	public ResponseDto getUser(String uuid);

}
