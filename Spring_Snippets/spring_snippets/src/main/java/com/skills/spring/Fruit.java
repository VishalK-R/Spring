package com.skills.spring;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Fruit {
	private String name;
	private List<String> nameList;
	private Map<String,String> nameColorMap;
	public Fruit() {
		
	}
	public Fruit(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public Map<String,String> getNameColorMap() {
		return nameColorMap;
	}
	public void setNameColorMap(Map<String,String> nameColorMap) {
		this.nameColorMap = nameColorMap;
	}

	public String talkAboutYourself() {
		String speech = "I am a Fruit. I come from a tree or plant that can be grown by seeds.";
		if (name!=null)
			speech+=" My name is: "+name;
		if(nameList!=null&&nameList.size()!=0) {
			for(String name : nameList) {
				speech+=" My name is: "+name+"\n";
			}
		}
		if(nameColorMap!=null&& nameColorMap.size()!=0) {
			for(Entry<String, String> entry : nameColorMap.entrySet()) {
				speech+=" My name is: "+entry.getKey()+" and my color is "+entry.getValue()+"\n";
			}
		}
		return speech;
	}
}
