package com.skills.meal;

public class Fruit {
	private String def;
	public String talkAboutYourself() {
		String speech = def;
		return speech;
	}
	public String getDef() {
		return def;
	}
	public void init() {
		System.out.println(def);
	}
	public void destroy() {
		System.out.println("Fruit to be destroyed");
	}
	public void setDef(String def) {
		this.def = def;
	}
}
