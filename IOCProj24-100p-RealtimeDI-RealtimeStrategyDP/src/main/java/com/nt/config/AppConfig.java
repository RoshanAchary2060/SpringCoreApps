package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nt.dao.CustomerDAOImpl;

@Configuration
@ComponentScan(basePackages="com.nt")
public class AppConfig {

	@Bean(name="oraDs")
	public DriverManagerDataSource createDsForOracle() {
		DriverManagerDataSource drds = new DriverManagerDataSource();
		drds.setDriverClassName("oracle.jdbc.OracleDriver");
		drds.setUrl("jdbc:oracle:thin:@//ROSHANPRO:1521/xe");
		drds.setUsername("spring");
		drds.setPassword("spring");
		return drds;
	}
	
}
