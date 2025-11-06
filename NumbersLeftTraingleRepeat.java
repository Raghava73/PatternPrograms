package com.patterns;

import java.util.Scanner;
public class NumbersLeftTraingleRepeat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		numbersLeftTraingleRepeat(n);
		sc.close();
	}
	public static void numbersLeftTraingleRepeat(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
	}

}
