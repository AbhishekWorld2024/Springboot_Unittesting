# Springboot_Unittesting
<h2>Mockito and Unit Testing in Spring Boot</h2>

<p>
Mockito is an open-source testing framework used for unit testing of Java applications. It plays a vital role in developing testable applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface used in Unit Testing.
</p>

<p>
Unit Testing is a type of software testing in which individual components of the software are tested. The major objective of using the Mockito framework is to simplify the development of a test by mocking external dependencies and using them in the test code. As a result, Mockito provides a simpler test code that is easier to understand, more readable, and modifiable.
</p>

<p>
Mockito can also be used with other testing frameworks like JUnit and TestNG. JUnit framework is a Java framework that is also used for testing. Now, JUnit is used as a standard when there is a need to perform testing in Java.
</p>

<p>
So, in this article, we are going to perform Unit Testing in a Spring Boot Project using Mockito and JUnit.
</p>

<h3>Annotations:</h3>

<ul>
  <li>
    <strong>@Mock:</strong> This annotation is used when we have to create and inject mock objects. It is used in testing frameworks like Mockito. Whenever a real object is to be simulated, a mock object is used because it does so in a controlled manner.<br/>
    <strong>Creation:</strong> Mockito creates a mock instance while <code>@Mock</code> is used.
  </li>
  
  <li>
    <strong>@InjectMocks:</strong> Used to automatically inject mocked dependencies to the object that is being tested.
  </li>

  <li>
    <strong>@Inject:</strong> This annotation is used to inject dependencies into a class. It belongs to the Java Dependency Injection framework. It is used to make the code modular and testable by decoupling creation, which means instead of creating its own dependencies, a class receives them from outside, making the class simpler.
  </li>

  <li>
    <strong>assert Method:</strong> It is used to check whether a condition is true. If the condition is false, the test fails and an error is generated. It is a part of testing to confirm that the code is behaving as expected. It is used for equality check, boolean check, null check, exception check, etc.
  </li>
</ul>
