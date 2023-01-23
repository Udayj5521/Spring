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
* [1. SpringHelloWorldExample](#-2-SpringHelloWorldExample)
* [2. Spring IOC (Inversion of Control)](#-1-installation)
* [Spring BeanFactory Container](#-1-installation)
* [Spring ApplicationContext Container](#-1-installation) 

* [FileSystemXmlApplicationContext](#-1-installation)
* [ClassPathXmlApplicationContext](#-1-installation)

* [3. Spring – Bean Definition](#-1-installation)
* [class](#-1-installation)
* [name](#-1-installation)
* [lazy-initialization mode](#-1-installation)
* [initialization method](#-1-installation)
* [destruction method](#-1-installation)
* [scope](#-1-installation)


* [4. Spring – Bean Scopes](#-1-installation)
* [singleton](#-1-installation)
* [The Prototype Scope](#-1-installation)

* [5. Spring – Dependency Injection](#-1-installation)
* [Constructor-based dependency injection](#-1-installation)
* [Setter-based dependency injection](#-1-installation)

* [properties](#-1-installation)
* [constructor-arg](#-1-installation)
* [autowire](#-1-installation)


* [6. Spring – Relationship](#-1-installation)
* [HAS-A relationship](#-1-installation)
* [Aggregation](#-1-installation)
* [Composition](#-1-installation)

* [7. Spring – Bean Definition Inheritance](#-1-installation)

* [8. Spring – Injecting Collection](#-1-installation)
* [list](#-1-installation)
* [set](#-1-installation)
* [map](#-1-installation)
* [properties>](#-1-installation)
	
	
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
<br /> 

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
<br /> 

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
<br /> 

## Q. What is Difference Between BeanFactory and Application Context?
|Bean Factory                                    |ApplicationContext                       |
|-----------------------------------------|----------------------------------------|
|1. Does not support the Annotation based dependency Injection| 1.Support Annotation based dependency Injection. -@Autowired, @PreDestroy|
|2.Support Lazy Loading 	        |2. Support Aggressive loading|
|3.It doesn't allow configure to multiple configuration files.|3.It allow to configure multiple configuration files.|
|BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));|ApplicationContext contect = new  ClassPathXmlApplicationContext("beans.xml");|
<br /> 

## FileSystemXmlApplicationContext

This container loads the definitions of the  beans from an XML file. 
Here you need to provide the full path of the XML bean configuration file to the constructor.

```java
public class Train {
	
	private int trainId;
	private double cost;
	private String seatNo;
	
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
}
```

```java
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSaveTrain {
	public static void main(String[] args) {

//		Train t = new Train();
//		t.setTrainId(101);
//		t.setSeatNo("A1");
//		t.setCost(70.00);
//
//		System.out.println(t.getTrainId());
//		System.out.println(t.getSeatNo());
//		System.out.println(t.getCost());

		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/udayj/Music/Beans.xml");

		Train t = (Train) context.getBean("myTrain");

		System.out.println("TrainId: " + t.getTrainId());
		System.out.println("Cost: " + t.getCost());
		System.out.println("SeatNo: " + t.getSeatNo());
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

	<bean id="myTrain" class="com.Train">
		<property name="trainId" value="101"></property>
		<property name="cost" value="70.00"></property>
		<property name="seatNo" value="A1"></property>
	</bean>

</beans>
```
- [`FileSystemXmlApplicationContext`](https://github.com/Udayj5521/Spring/tree/main/SpringFileSystem)

## Output

```java
TrainId: 101
Cost: 70.00
SeatNo: A1
```
<br /> 


## ClassPathXmlApplicationContext
This container loads the definitions of the  beans from an XML file. Here you do not need
to provide the full path of the XML file but you need to set CLASSPATH properly because 
this container will look like bean configuration XML file in CLASSPATH.

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
<br /> 

# 3. Spring – Bean Definition
The objects that form the backbone of your application and that are managed by the 
Spring IoC container are called beans. 
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC 
container. These beans are created with the configuration metadata that you supply to the
container. 

For example, in the form of XML 
<bean/> definitions which you have already seen in the previous BeanFactory and 
ApplicationContext.

## 1. class
This attribute is mandatory and specifies the bean class to be used to create the bean.

 A simple bean definition
 
 ```java
<!-- A simple bean definition -->
 <bean id="..." class="...">
 <!-- collaborators and configuration for this bean go here -->
 </bean>
```

## 2.name
This attribute specifies the bean identifier uniquely. In XMLbased configuration metadata, 
you use the id and/or name attributes to specify the bean identifier(s).

<!-- A simple bean definition -->
 <bean id="..." class="...">
 <!-- collaborators and configuration for this bean go here -->
 </bean>
```

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
<br /> 
