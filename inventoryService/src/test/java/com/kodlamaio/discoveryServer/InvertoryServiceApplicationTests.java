package com.kodlamaio.discoveryServer;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class InvertoryServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Bean
	public ModelMapper getmodelMapper() {
		return new ModelMapper();
	}
}
