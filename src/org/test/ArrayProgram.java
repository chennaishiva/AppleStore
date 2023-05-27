package org.test;

public class ArrayProgram {
	
	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 20;
		a[4] = 50;
		a[2] = 100;
		
		//To print the values in array
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//To get the length of array
		int length = a.length;
		System.out.println(length);
		
		//To iterate all the values in array using normal for loop
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		//To iterate all the values in array using enhanced for loop
		for(int x : a) {
			System.out.println(x);
		}
		
		
		
		
		
		
	}

}
