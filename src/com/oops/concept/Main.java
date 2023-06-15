package com.oops.concept;

public class Main {

	public static void main(String[] args) {

		//Inheritance
		Cat ct = new Cat();
		Dog dg = new Dog();
		ct.sound();
		ct.run();
		dg.sound();
		dg.eat();
		System.out.println();

		//Abstraction
		Bike v = new Bike();
		v.sound();
		v.wheel();
		v.run();
		System.out.println();

		//Interface
		Nokia nk = new Nokia();
		System.out.println(nk.manufactDate());
		nk.ringtone();
		System.out.println();

		//Encapsulation
		EncapsulateBank bank = new EncapsulateBank();
		bank.setAcc_no(7560504000L);
		bank.setName("Saurabh");
		bank.setEmail("saurabh@effigo.com");
		bank.setAmount(232443545);
		System.out.println(bank.getAcc_no() + " " + bank.getName() + " " + bank.getEmail() + " " + bank.getAmount());

	}

}
