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
        
        // Get the "fruitBean" and "vegetableBean" from the Spring container
        Fruit fruit = (Fruit) context.getBean("fruitBean");
        Vegetable vegetable = (Vegetable) context.getBean("vegetableBean");
        
        Fruit fruitWithName = (Fruit) context.getBean("fruitWithName");
        Vegetable vegetableWithName = (Vegetable) context.getBean("vegetableWithName");
        
        System.out.println(fruit.talkAboutYourself());
        System.out.println(vegetable.talkAboutYourself());
        System.out.println(fruitWithName.talkAboutYourself());
        System.out.println(vegetableWithName.talkAboutYourself());
        
        Fruit fruitWithNameListAndMap = (Fruit) context.getBean("fruitWithNameListAndMap");
        
        System.out.println(fruitWithNameListAndMap.talkAboutYourself());
    }
}
