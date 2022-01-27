package com.SpringBootNivell2.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootNivell2.service.interfaz.IUserService;
import com.SpringBootNivell2.dto.UserResponseDto;

@RestController
@RequestMapping("/v1")
public class Controller {
	
	private final IUserService userService;

    @Autowired
    public Controller(IUserService userService){
        this.userService = userService;
    }
    
    @GetMapping("/test")
    public String helloGradle() {
        return "Hello Gradle!";
    }
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	    return String.format("Hello %s!", name); 
	}
	
	//@PutMapping(value ="", consumes = {"application/json"})
    @GetMapping("/user/{uuid}")
    public ResponseEntity<UserResponseDto> updatePrescription(
            @PathVariable(name="uuid") String user) throws Exception {


        UserResponseDto userResponseDto = userService.getUser("pp");

        System.out.println(userResponseDto.getName());
        System.out.println(userResponseDto.getSurname());
        System.out.println(userResponseDto.getGender());

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }


}
