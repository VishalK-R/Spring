package com.skills.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the "helloWorldBean" from the Spring container
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");

        // Call a method on the bean
        helloWorld.getMessage();
    }
}
