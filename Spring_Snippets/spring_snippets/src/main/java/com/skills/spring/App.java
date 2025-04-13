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

		Meal mealUsingSetterInjection = (Meal) context.getBean("mealUsingSetterInjection");
		Meal mealUsingConstructorInjection1 = (Meal) context.getBean("mealUsingConstructorInjection1");
		Meal mealUsingConstructorInjection2 = (Meal) context.getBean("mealUsingConstructorInjection2");
		
		System.out.println(mealUsingSetterInjection.talkAboutYourSelf());
		System.out.println(mealUsingConstructorInjection1.talkAboutYourSelf());
		System.out.println(mealUsingConstructorInjection2.talkAboutYourSelf());
	}
}
