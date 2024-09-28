package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Task_exception extends RuntimeException{
	public Task_exception (String msg) {
		super(msg);
		
	}
}