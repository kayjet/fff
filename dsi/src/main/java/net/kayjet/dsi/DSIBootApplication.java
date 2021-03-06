package net.kayjet.dsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableDiscoveryClient
@SpringBootApplication
public class DSIBootApplication{
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(DSIBootApplication.class);
	}*/
	
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DSIBootApplication.class, args);
        
    }
}