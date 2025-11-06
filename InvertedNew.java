package com.patterns;

import java.util.Scanner;

public class InvertedNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		invertedNew(n);
		sc.close();

	}

	public static void invertedNew(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<i; j++)//if we use <= here it will take extra space at starting
			{
				System.out.print(" ");
			}
			for(int j=0; j<=n-i-1;j++)//this can be done without -1 also
			{
				System.out.print("*");
			}
			System.out.println();
				
				
		}
		
	}

}
