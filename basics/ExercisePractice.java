package com.rays.basics;

public class ExercisePractice {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 <= 0) {
				sum = i + sum;
			}
		}
		System.out.println(sum);
	}

}
