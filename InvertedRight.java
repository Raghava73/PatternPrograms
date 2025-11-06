package com.patterns;
import java.util.Scanner;
public class InvertedRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int n = sc.nextInt();
		invertedRight(n);
		sc.close();
	}
	public static void invertedRight(int n) {
		// TODO Auto-generated method stub
		for(int i=n; i>=1; i--) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();	
		}	
	}
}
