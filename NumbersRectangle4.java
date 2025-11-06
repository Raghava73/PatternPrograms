package com.patterns;

import java.util.Scanner;

public class NumbersRectangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		numbersRectangle(n);
		sc.close();
	}
	public static void numbersRectangle(int n) {
		// TODO Auto-generated method stub
		for(int k=0; k<=n; k++) {
			int count=k+1;
			for(int m=0; m<=n; m++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
	}

}
