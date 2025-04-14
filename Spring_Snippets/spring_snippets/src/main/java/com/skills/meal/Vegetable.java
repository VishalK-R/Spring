package com.skills.meal;

public class Vegetable {
	private String def;
	public String talkAboutYourself() {
		String speech = def;
		return speech;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
}
