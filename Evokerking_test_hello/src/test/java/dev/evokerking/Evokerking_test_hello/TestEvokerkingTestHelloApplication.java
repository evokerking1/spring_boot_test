package dev.evokerking.Evokerking_test_hello;

import org.springframework.boot.SpringApplication;

public class TestEvokerkingTestHelloApplication {

	public static void main(String[] args) {
		SpringApplication.from(EvokerkingTestHelloApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
