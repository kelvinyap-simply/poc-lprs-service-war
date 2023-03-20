package com.simply.poclprsservicewar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PocLprsServiceWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PocLprsServiceWarApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PocLprsServiceWarApplication.class);
	}

	//@GetMapping("/hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	//@PostMapping("/api/eventReceiver")
	@RequestMapping(value = "/api/eventReceiver", method = RequestMethod.POST)
	public String eventListener(@RequestBody String msg) {
		System.out.println("Message: " + msg);
		return msg;
	}

}
