package com.kodlamaio.inventoryServer;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kodlamaio.common.utilities.exceptions.BusinessException;
import com.kodlamaio.common.utilities.mapping.ModelMapperManager;
import com.kodlamaio.common.utilities.mapping.ModelMapperService;

@SpringBootApplication
@EnableDiscoveryClient
public class InvertoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvertoryServiceApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public ModelMapperService getModelMapperService(ModelMapper modelMapper) {
		return new ModelMapperManager(modelMapper);

}
	
}