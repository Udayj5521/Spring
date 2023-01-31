package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
		System.out.println("Bean is going through init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now");
	}
}
