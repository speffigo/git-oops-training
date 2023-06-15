package com.oops.concept;

public interface InterfacePhone {

	public void ringtone();

	public int manufactDate();

	public void name();
}

class Nokia implements InterfacePhone {

	@Override
	public void ringtone() {

		System.out.println("ting-ting-tring");
	}

	@Override
	public int manufactDate() {

		return 1978;
	}

	@Override
	public void name() {

		System.out.println("Connecting people");
	}

}
