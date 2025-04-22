package com.skills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skills.meal.Meal;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Load the Spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		 Meal mealbeanAutowiredByType = (Meal)context.getBean("mealbeanAutowiredByType");
//		 System.out.println(mealbeanAutowiredByType.talkAboutYourSelf());
		 
//		Meal mealbeanAutowiredByName = (Meal)context.getBean("mealbeanAutowiredByName");
//		System.out.println(mealbeanAutowiredByName.talkAboutYourSelf());
		
//		Meal mealbeanAutowiredByConstructor = (Meal)context.getBean("mealbeanAutowiredByConstructor");
//		System.out.println(mealbeanAutowiredByConstructor.talkAboutYourSelf());
		
		Meal mealbeanAutowiredByDefault = (Meal)context.getBean("mealbeanAutowiredByDefault");
		System.out.println(mealbeanAutowiredByDefault.talkAboutYourSelf());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
