package com.patterns;

import java.util.Scanner;

public class FlyodsTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
	    flyodsTraingle(n);
		sc.close();
	}
	
	public static void flyodsTraingle(int n) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
	}

}
