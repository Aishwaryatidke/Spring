package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {

	private Map<String, String> coursesDuration;
	private List<String> friends;
	
	
	public Map<String, String> getCoursesDuration() {
		return coursesDuration;
	}

	public void setCoursesDuration(Map<String, String> coursesDuration) {
		this.coursesDuration = coursesDuration;
	}



	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [coursesDuration=" + coursesDuration + ", friends=" + friends + "]";
	}
	
}
