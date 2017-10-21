package com.xunhe;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class JavaWebZbApplication {
	
	public JavaWebZbApplication() {
		// TODO Auto-generated constructor stub
	}
/*	 @Bean(name = "dataSource")
     @Primary
     @ConfigurationProperties(prefix = "spring.datasource")
     public DataSource dataSource(){
         return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
     }*/
	public static void main(String[] args) {
		SpringApplication.run(JavaWebZbApplication.class, args);
	}
}
