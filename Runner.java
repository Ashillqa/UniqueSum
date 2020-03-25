package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		UniqueSum test = new UniqueSum();
		
		System.out.println(test.unique(1, 2, 3));
		System.out.println(test.unique(3, 3, 3));
		System.out.println(test.unique(1, 1, 3));
	}

}
