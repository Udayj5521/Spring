# Spring
* Spring is the most popular application development framework for enterprise Java. Millions 
of developers around the world use Spring Framework to create high performing, easily 
testable, and reusable code.
* Spring framework is an open source Java platform. 
* It was initially written by Rod Johnson and was first released under the Apache 2.0 license
in June 2003.
* Spring is lightweight when it comes to size and transparency. The basic version of Spring 
framework is around 2MB.
<br/>

# Benefits of Using the Spring Framework
Following is the list of few of the great benefits of using Spring Framework:

* Spring does not reinvent the wheel, instead it truly makes use of some of the 
existing technologies like several ORM frameworks, logging frameworks, JEE, 
Quartz and JDK timers, and other view technologies.

* Testing an application written with Spring is simple because environment
dependent code is moved into this framework. Furthermore, by using JavaBean-style POJOs
(Plain Old Java Object), it becomes easier to use dependency injection for injecting test data.

* Spring's web framework is a well-designed web MVC framework, which provides a 
great alternative to web frameworks such as Struts or other over-engineered or 
less popular web frameworks.

* Spring provides a convenient API to translate technology-specific exceptions 
(thrown by JDBC, Hibernate for example) into consistent, unchecked exceptions.
<br/>

## Table of Contents

* [Introduction](#-1-introduction)
* [Installation](#-2-installation)
* [Spring BeanFactory Container](#-3-Spring BeanFactory Container)

# Spring – Hello World Example

* The first step is to create an application context where we used framework 
API ClassPathXmlApplicationContext(). This API loads beans configuration file 
and eventually based on the provided API, it takes care of creating and initializing 
all the objects, i.e. beans mentioned in the configuration file.

* The second step is used to get the required bean using getBean() method of the 
created context. This method uses bean ID to return a generic object, which finally 
can be casted to the actual object. Once you have an object, you can use this 
object to call any class method.

```java
public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;

	}
}
```

```java

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

//		HelloWorld h = new HelloWorld();
//		h.setMessage("Good Morning");
//
//		System.out.println(h.getMessage());

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld h = (HelloWorld) context.getBean("myHello");
		System.out.println(h.getMessage());
	}

}
```
XML FILE
```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context-3.0.xsd">


	<bean id="myHello" class="com.HelloWorld">
	<property name="message" value="Good Morning"></property>
	</bean>
    

</beans>
```


## # 1. INTRODUCTION

<br/>


## # 2. Installation

Add the following dependency to your project:

```xml
<dependency>
    <groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>5.3.18</version>
</dependency>
```

## Spring IOC (Inversion of Control)

## 1. Spring BeanFactory Container

This is the simplest container providing the basic support for DI and is defined by 
the org.springframework.beans.factory.BeanFactoryinterface. The BeanFactory 
and related interfaces, such as BeanFactoryAware, InitializingBean, 
DisposableBean, are still present in Spring for the purpose of backward 
compatibility with a large number of third-party frameworks that integrate with 
Spring.

Logbook comes with some built-in strategies:

- [`BodyOnlyIfStatusAtLeastStrategy`](logbook-core/src/main/java/org/zalando/logbook/BodyOnlyIfStatusAtLeastStrategy.java)
- [`StatusAtLeastStrategy`](logbook-core/src/main/java/org/zalando/logbook/StatusAtLeastStrategy.java)
- [`WithoutBodyStrategy`](logbook-core/src/main/java/org/zalando/logbook/WithoutBodyStrategy.java)


## Q. What are the important features of Java 8 release?

* Interface methods by default;

<div align="right">
    <b><a href="(#-2-installation)">↥ back to top</a></b>
</div>


## Q. In Java, How many ways you can take input from the console?

In Java, there are three different ways for reading input from the user in the command line environment ( console ).

**1. Using Buffered Reader Class:**

This method is used by wrapping the System.in ( standard input stream ) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line.

```java
/**
 * Buffered Reader Class
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}
```


<div align="right">
    <b><a href="(#-2-installation)">↥ back to top</a></b>
</div>


# Get started

You need

* Java
* Maven


As an alternative:
* Run the [TripBookingSaga.java](src/main/java/io/flowing/trip/saga/camunda/simple/TripBookingSaga.java) class via your favorite IDE - it also will run instances of the Saga without requiring any infrastructure

## Q. What is difference between Error and Exception?
|ERROR                                    |EXCEPTION                               |
|-----------------------------------------|----------------------------------------|
|An error is caused due to lack of system resources.|An exception is caused because of the code.|
|An error is irrecoverable.	            |An exception is recoverable.|
|There is no means to handle an error by the program code.|	Exceptions are handled using three keywords "try", "catch", and "throw".|
|As the error is detected the program will terminated abnormally.|As an exception is detected, it is thrown and caught by the "throw" and "catch" keywords correspondingly.|
|Errors are classified as unchecked type.|Exceptions are classified as checked or unchecked type.|
|In Java, errors are defined "java.lang.Error" package.|In Java, an exceptions are defined in"java.lang.Exception".|
|OutOfMemory, StackOverFlow.|Checked Exceptions: NoSuchMethod, ClassNotFound.Unchecked Exceptions: NullPointer, IndexOutOfBounds.|


<div align="right">
    <b><a href="#-2-installation>↥ back to top</a></b>
</div>
