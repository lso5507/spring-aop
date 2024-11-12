package com.example.springaop.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springaop.exceptionHandler.ExceptionHandler;

@SpringBootTest
public class test {
	@Autowired
	private  ExceptionHandler exceptionHandler;



	@Test
	public void test(){
		exceptionHandler.print();
	}
}
