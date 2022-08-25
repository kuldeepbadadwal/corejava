package com.rays.basics;

public class StringQue_2 {
	public static void main(String[] args) {
		String s = "Vijay Dinanath Chouhan";
		char c = 'a';
		int j =0;
		for (int i = 0; i <= s.length()-1 ; i++) {
			char k = s.charAt(i);
			if (c==k) {
				j++;
			}
		}
		System.out.println("you character count of "+c+ " is " +j);
	}

}
