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

* [Installation](#-1-installation)
* [SpringHelloWorldExample](#-2-SpringHelloWorldExample)

# Spring – Hello World Example

* The first step is to create an application context where we used framework 
API ClassPathXmlApplicationContext(). This API loads beans configuration file 
and eventually based on the provided API, it takes care of creating and initializing 
all the objects, i.e. beans mentioned in the configuration file.

* The second step is used to get the required bean using getBean() method of the 
created context. This method uses bean ID to return a generic object, which finally 
can be casted to the actual object. Once you have an object, you can use this 
object to call any class method.

## Installation

Add the following dependency to your project:

```xml
<dependency>
    <groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>5.3.18</version>
</dependency>
```

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
## XML FILE

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
- [`SpringOnline`](https://github.com/Udayj5521/Spring/tree/main/SpringOnline)

## Output

```java
Good Morning
```
# Spring IOC (Inversion of Control)

## 1. Spring BeanFactory Container

This is the simplest container providing the basic support for DI and is defined by 
the org.springframework.beans.factory.BeanFactoryinterface. The BeanFactory 
and related interfaces, such as BeanFactoryAware, InitializingBean, 
DisposableBean, are still present in Spring for the purpose of backward 
compatibility with a large number of third-party frameworks that integrate with 
Spring.

```java

public class Student {
	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
```

```java

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSaveStudent {
	public static void main(String[] args) {


//		XmlBeanFactory x = new XmlBeanFactory(new ClassPathResource("beans.xml"));

		Resource r = new ClassPathResource("beans.xml");
		BeanFactory x = new XmlBeanFactory(r);

		Student s = (Student) x.getBean("myStudent");

		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Email: "+s.getEmail());
	}
}
```
## XML FILE

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context-3.0.xsd">

	<bean id="myStudent" class="com.Student">
	<property name="id" value="1"></property>
	<property name="name" value="Dinga"></property>
	<property name="email" value="Dinga@gmail.com"></property>

	</bean>
</beans>
```
- [`SpringBeanFactoryContainer`](https://github.com/Udayj5521/Spring/tree/main/SpringBeanFactoryContainer)

## Output

```java
Id: 1
Name: Dinga
Email: Dinga@gmail.com
```

## 2. Spring ApplicationContext Container

This container adds more enterprise-specific functionality such as the ability to 
resolve textual messages from a properties file and the ability to publish 
application events to interested event listeners. This container is defined by 
the org.springframework.context.ApplicationContext interface.

```java


public class Employee {

	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
```

```java

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveEmployee {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = (Employee) context.getBean("myEmployee");

		System.out.println("Id: " + e.getId());
		System.out.println("Name: " + e.getName());
		System.out.println("Salary: " + e.getSalary());
	}
}
```
## XML FILE

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context-3.0.xsd">

	<bean id="myEmployee" class="com.Employee">
		<property name="id" value="1"></property>
		<property name="name" value="Dinga"></property>
		<property name="salary" value="50000.00"></property>
	</bean>
	
</beans>
```
- [`SpringApplicationContextContainer`](https://github.com/Udayj5521/Spring/tree/main/SpringApplicationContextContainer)

## Output

```java
Id: 1
Name: Dinga
Salary: 50000.0
```

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
