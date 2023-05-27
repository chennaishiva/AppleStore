package com.orveloading;

public class GreensBank extends AxisBank {
	
	@Override
	public void savingsAcc() {
		System.out.println("12%");
	}

	@Override
	public void currentAcc() {
		System.out.println("14%");
	}
	
	public void creditCard(int intrestRate) {
		System.out.println(intrestRate);
	}
	
	public static void main(String[] args) {
		GreensBank g = new GreensBank();
		g.savingsAcc();
		g.currentAcc();
		g.creditCard(6);
	}
}
