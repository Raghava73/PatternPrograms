package com.patterns;

import java.util.Scanner;

public class NumberRectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		numberRectangle(n);
		sc.close();
		

	}

	public static void numberRectangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}

}
