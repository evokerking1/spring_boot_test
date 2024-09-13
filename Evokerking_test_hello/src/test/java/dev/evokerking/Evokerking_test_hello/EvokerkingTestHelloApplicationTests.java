package dev.evokerking.Evokerking_test_hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class EvokerkingTestHelloApplicationTests {

	@Test
	void contextLoads() {
	}

}
