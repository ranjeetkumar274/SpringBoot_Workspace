package com.ashu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashu.beans.Motor;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
		ConfigurableApplicationContext configurableContext = (ConfigurableApplicationContext) context;
		
		configurableContext.registerShutdownHook();
	}
}
