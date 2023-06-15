package com.polymorphism.overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		addition ad = new addition();
		ad.sum(2, 0);
	}

}

class addition {
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
}
