package com.oops.concept;

public class InheritAnimal {

	public void run() {
		System.out.println("slowly");
	}

	public void sound() {
		System.out.println("baw");
	}
}

class Cat extends InheritAnimal {

	public void sound() {
		System.out.println("miaow");
	}

	public void eat() {
		System.out.println("Non-veg");
	}

}

class Dog extends Cat {
	public void sound() {
		System.out.println("baww-baww");
	}
}
