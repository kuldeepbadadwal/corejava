package com.rays.basics;

public class ArrayTable {
	public static void main(String[] args) {
		int[][] a=new int[11][4] ;
		for (int i = 1; i <a.length; i++) {
			for (int j = 1; j < 4; j++) {
			 a[i][j] = i*j;
			 System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
