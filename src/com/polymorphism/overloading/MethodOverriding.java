package com.polymorphism.overloading;

class vehicle {
	public void speed() {
		System.out.println("30 km/hr");
	}
}

class car extends vehicle {

	public void speed() {
		System.out.println("40 km/hr");
	}
}

class MethodOverriding {
	public static void main(String args[]) {
		vehicle vv = new car();
		vv.speed();
	}
}
