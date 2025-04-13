package com.skills.meal;

public class Meal {
	Fruit fruit;
	Vegetable vegetable;
	Meat meat;
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Vegetable getVegetable() {
		return vegetable;
	}
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}
	public String talkAboutYourSelf() {
		String speech = "Meal contains:";
		if(fruit!=null)speech+=" Fruit";
		if(vegetable!=null)speech+=" Vegetable";
		if(meat!=null)speech+=" Meat";
		return speech;
	}
	public Meal() {
		
	}
	public Meal(Fruit fruit, Vegetable vegetable, Meat meat) {
		this.fruit = fruit;
		this.vegetable = vegetable;
		this.meat = meat;
	}
}
