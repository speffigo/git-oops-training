package com.oops.concept;

abstract class AbstractVehicle {

	public void run() {
		System.out.println("fast");
	}

	abstract void sound();

	abstract void wheel();
}

class Bike extends AbstractVehicle {

	@Override
	void sound() {
		System.out.println("brumm-brumm");
	}

	void wheel() {
		System.out.println("2 wheeled");
	}
}
