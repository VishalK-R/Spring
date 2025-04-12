package com.skills.spring;

public class Vegetable {
	private String name;
	
	public String talkAboutYourself() {
		String speech = "I am a vegetable. I am a plant that can be eaten.";
		if(name!=null) speech+=" My name is: "+name; 
		return speech;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
