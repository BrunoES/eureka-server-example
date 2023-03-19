package com.example.eurekaexample.controledepedidos.adapters.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.eurekaexample.controledepedidos.ControleDePedidosApplication;

@Configuration
@ComponentScan(basePackageClasses = ControleDePedidosApplication.class)
public class BeanConfiguration {
	
	@Value("${kafka.address:localhost:9092}")
	private String kafkaAddress;
    
}