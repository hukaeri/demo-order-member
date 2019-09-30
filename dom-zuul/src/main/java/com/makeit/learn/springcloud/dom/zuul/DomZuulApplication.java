package com.makeit.learn.springcloud.dom.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DomZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomZuulApplication.class, args);
	}

}
