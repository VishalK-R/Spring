package com.skills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Load the Spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Vegetable vegetableUsingPNameSpace = (Vegetable) context.getBean("vegetableUsingPNameSpace");
		com.skills.meal.Fruit fruitWithNameBean = (com.skills.meal.Fruit) context.getBean("fruitWithNameBean");
		com.skills.meal.Vegetable vegetableWithNameBean = (com.skills.meal.Vegetable) context.getBean("vegetableWithNameBean");
		com.skills.meal.Meal mealOuterBean = (com.skills.meal.Meal) context.getBean("mealOuterBean");
		com.skills.meal.Fruit fruitWithInitAndDestroy = (com.skills.meal.Fruit) context.getBean("fruitWithInitAndDestroy");
		
		System.out.println(vegetableUsingPNameSpace.talkAboutYourself());
		System.out.println(fruitWithNameBean.talkAboutYourself());
		System.out.println(vegetableWithNameBean.talkAboutYourself());
		System.out.println(mealOuterBean.talkAboutYourSelf());
		System.out.println(fruitWithInitAndDestroy.talkAboutYourself());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
