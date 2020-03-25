package com.qa.main;

public class UniqueSum {
	
	public int unique(int n1, int n2, int n3) {
		
		if (n1 == n2 && n1 == n3) {
			return 0;
		} else if (n1 == n2) {
			return n3;
		} else if (n1 == n3) {
			return n2;
		} else if (n2 == n3) {
			return n1;
		} else {
			return n1+n2+n3;
		}
	}

}
