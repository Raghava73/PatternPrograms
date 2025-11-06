package com.patterns;

import java.util.Scanner;

public class NumbersLeftTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		numbersLeftTraingle(n);
		sc.close();

	}

	public static void numbersLeftTraingle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
	}

}
