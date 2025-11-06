package com.patterns;
import java.util.Scanner;
public class NumbersRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Rows");
		int n = sc.nextInt();
		numbersRectangle(n);
		sc.close();
	}
	public static void numbersRectangle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		
	}

}
