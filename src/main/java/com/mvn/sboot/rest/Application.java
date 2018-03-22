package com.mvn.sboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}

/**
* The @EnableAutoConfiguration annotation enables the auto-configuration of Spring ApplicationContext by scanning the classpath components and registers the beans that are matching various conditions. These bean classes will be annotated with @Configuration annotation.
* Typically AutoConfiguration classes are annotated with @Configuration to mark it as a Spring configuration class and annotated with @EnableConfigurationProperties to bind the customization properties and one or more Conditional bean registration methods.
* SpringBoot provides various AutoConfiguration classes in spring-boot-autoconfigure-{version}.jar, which are responsible for registering various components.
**/
/** Or use this configurations **/
/*@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}
*/