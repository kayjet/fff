package net.kayjet.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
//	  ApplicationContext ctx;
    SpringApplication.run(Application.class, args);
  }

}