package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UService {
	
	@Autowired
	UMapper mapper;
	
	public List<User> selectAll() {
		return mapper.selectAll();
	}

}
