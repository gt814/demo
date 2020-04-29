package com.example.circular.dependencies;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class)
				//.initializers((GenericApplicationContext c) -> c.setAllowCircularReferences(false) )
				.run(args);


	}
}
