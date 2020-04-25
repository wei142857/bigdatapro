package com.wqz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wqz.app.*"})
public class StartApp {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(StartApp.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
}
