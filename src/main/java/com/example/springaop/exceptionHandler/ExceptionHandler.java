package com.example.springaop.exceptionHandler;

import org.springframework.stereotype.Component;

import com.example.springaop.discord.DiscordAlrm;

@Component
public class ExceptionHandler {
	@DiscordAlrm
	public void print(){
		System.out.println("thorws NullPointerException");
	}
}
