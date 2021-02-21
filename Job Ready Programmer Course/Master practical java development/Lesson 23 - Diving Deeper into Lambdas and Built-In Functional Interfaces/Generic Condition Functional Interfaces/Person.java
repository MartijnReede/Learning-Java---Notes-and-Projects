package com.jobready.genericfunctionalinterfaces;

public class Person {

	String name;
	double length;
	String hairColor;
	int age;
	
	
	public Person(String name, double length, String hairColor, int age) {
		super();
		this.name = name;
		this.length = length;
		this.hairColor = hairColor;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", length=" + length + ", hairColor=" + hairColor + ", age=" + age + "]";
	}
	
}
