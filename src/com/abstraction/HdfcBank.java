package com.abstraction;

public class HdfcBank implements RbiBank, WorldBank {

	@Override
	public void fixed() {
		System.out.println("2%");
	}

	@Override
	public void savings() {
		System.out.println("12%");

	}

	@Override
	public void deposit() {
		System.out.println("5%");

	}
	
	public static void main(String[] args) {
		HdfcBank h = new HdfcBank();
		h.savings();
		h.deposit();
		h.fixed();
		
		// I               C
		RbiBank r = new HdfcBank();
		r.deposit();
		r.savings();
		
		
	}

	
	

}
