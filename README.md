# Spring
<br/>


## Table of Contents

* [Introduction](#-1-introduction)

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
    <b><a href="#-1-introduction">↥ back to top</a></b>
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
    <b><a href="#-1-introductions">↥ back to top</a></b>
</div>
