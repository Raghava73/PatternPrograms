package com.patterns;

import java.util.Scanner;

public class SerialNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows to Print");
		int n = sc.nextInt();
		serialNumbers(n);
		sc.close();
	}

	public static void serialNumbers(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n;i++) {
			for(int j=0; j<=n;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
	}

}
