package com;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	List name;
	Set id;
	Map address;
	Properties marks;

	public List getName() {
		return name;
	}

	public void setName(List name) {
		this.name = name;
	}

	public Set getId() {
		return id;
	}

	public void setId(Set id) {
		this.id = id;
	}

	public Map getAddress() {
		return address;
	}

	public void setAddress(Map address) {
		this.address = address;
	}

	public Properties getMarks() {
		return marks;
	}

	public void setMarks(Properties marks) {
		this.marks = marks;
	}

}
