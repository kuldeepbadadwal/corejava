package com.rays.basics;

public class FibonacciSeries {
	public static void main(String[] args) {
	 int n1=0,n2=1,n3;
		int a = 20;
		for (int i = 2; i <= a; i++) {
			  System.out.print(" "+n1);  
			n3=n1+n2;     
			  n1=n2;    
			  n2=n3;    
		}

	}

}
