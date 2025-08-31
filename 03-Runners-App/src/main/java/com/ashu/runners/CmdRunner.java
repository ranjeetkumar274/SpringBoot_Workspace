package com.ashu.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CmdRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command line runner is called...");
		
	}

}
