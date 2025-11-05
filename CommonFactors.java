package com.patterns;

import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int n = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int m = sc.nextInt();
		highestCommonFactor(n,m);
		lowestCommonFactor(n,m);
		sc.close();

	}

	public static void lowestCommonFactor(int n, int m) {
		// TODO Auto-generated method stub
		for(int i=1; i<=m; i++) {
			if(n%i==0 && m%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void highestCommonFactor(int n, int m) {
		// TODO Auto-generated method stub
		for(int i=m; i>=1; i--) {
			if(n%i==0 && m%i==0) {
				System.out.print(i);
				break;
			}
		} 
		System.out.println();
		
	}

}
