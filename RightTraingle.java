package com.patterns;

import java.util.Scanner;

public class RightTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		rightTraingle(n);
		sc.close();

	}

	public static void rightTraingle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
