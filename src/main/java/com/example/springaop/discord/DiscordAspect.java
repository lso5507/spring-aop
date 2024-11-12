package com.example.springaop.discord;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;

@Aspect
@Component
@AutoConfigurationPackage
public class DiscordAspect {

	@Before("@annotation(com.example.springaop.discord.DiscordAlrm)")
	public void beforeLog() {
		System.out.println("BeforeError!");
	}
	@After("@annotation(com.example.springaop.discord.DiscordAlrm)")
	public void AfterLog() {
		System.out.println("AfterError!");
	}

}
