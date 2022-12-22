package com.example.springeventproject;

import com.example.springeventproject.publisher.ZeeCafePublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEventProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringEventProjectApplication.class, args);
		ZeeCafePublisher zeeCafePublisher = applicationContext.getBean("zeeCafePublisher",ZeeCafePublisher.class);
		zeeCafePublisher.streamBigBangTheory("EP - 004");
		zeeCafePublisher.streamComedyCircus("CC - 005");
	}

}
