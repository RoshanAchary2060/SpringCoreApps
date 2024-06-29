package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="com.nt")

@ImportResource(locations="com/nt/cfgs/applicationContext.xml")
@PropertySource(value="com/nt/commons/jdbc.properties") // necessary here also
public class AppConfig {
	
	@Autowired
	private Environment env;
	
//	@Bean(name="dmds")
	@Bean
	public DriverManagerDataSource createDsForOracle() {
		DriverManagerDataSource drds = new DriverManagerDataSource();
		
		// note:: since these are java method call statements,
		// we can not use @Value with ${...}
		drds.setDriverClassName(env.getRequiredProperty("jdbc.driver")); // key is passed as argument
		drds.setUrl(env.getRequiredProperty("jdbc.url"));
		drds.setUsername(env.getRequiredProperty("db.user"));
		drds.setPassword(env.getRequiredProperty("db.password"));
		return drds;
	}
	
}
