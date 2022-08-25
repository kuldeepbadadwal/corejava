package com.rays.basics;

public class String_Reverse {
	public static void main(String[] args) {
		String s = "Vijay Dinanath Chouhan";
		String[] n = s.split(" ");
		for (int i = 0; i <= n.length-1; i++) {
			String f = n[i];
			for (int j = f.length()-1; j >= 0; j--) {
				System.out.print(f.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
