package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//JSR 250 Annotations
//@PostConstructor and @PreDestroy Annoatiaons
public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will Destroy now");
	}
	
}
