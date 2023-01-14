# Spring
<br/>


## Table of Contents

* [Introduction](#-1-introduction)
* [Java Architecture](#-2-java-architecture)

## Related Topics

* *[Multithreading Basics](multithreading-questions.md)*
* *[Collections Basics](collections-questions.md)*
* *[JDBC Basics](JDBC-questions.md)*

## # 1. INTRODUCTION

<br/>

## Q. What are the important features of Java 8 release?

* Interface methods by default;

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
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
    <b><a href="#related-topics">↥ back to top</a></b>
</div>


# Get started

You need

* Java
* Maven

Required steps

* Checkout or download this project
* Run the [Application.java](src/main/java/io/flowing/trip/saga/camunda/springboot/Application.java) class as this is a Spring Boot application running everything at once, starting exactly one Saga that is always "crashing" in the flight booking
* If you like you can access the Camunda database from the outside, e.g. using the ["Camunda Standalone Webapp"](https://camunda.org/download/) to inspect state. Use the follwing connection url: ```jdbc:h2:tcp://localhost:8092/mem:camunda;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE```. Note that you need [Camunda Enterprise](https://camunda.com/trial/) to see historical data.

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
    <b><a href="#related-topics">↥ back to top</a></b>
</div>
