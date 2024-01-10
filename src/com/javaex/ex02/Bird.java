package com.javaex.ex02;

public abstract class Bird {

	private String name;

	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}

	public abstract void showName();

	public abstract void sing();

	public abstract void fly();

}
