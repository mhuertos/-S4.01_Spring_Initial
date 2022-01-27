package com.SpringBootNivell2.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootNivell2.dto.UserResponseDto;

@Repository
@Transactional
public class UserRepository implements IRepository, JpaRepository{
	
	@Autowired
	private UserResponseDto userResponseDto;
	
	public UserResponseDto getUser(String uuid) {
		userResponseDto.setName("Marcos");
		userResponseDto.setSurname("Huertos");
		userResponseDto.setGender("Male");
		return userResponseDto;
	}

	@Override
	public Page findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional findOne(Example example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page findAll(Example example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Example example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists(Example example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findBy(Example example, Function queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAllById(Iterable ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List saveAll(Iterable entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object saveAndFlush(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List saveAllAndFlush(Iterable entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getOne(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
