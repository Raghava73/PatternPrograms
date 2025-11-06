package com.patterns;
import java.util.Scanner;
public class NumbersRectangle3 {
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
		for(int i=0; i<n; i++) {
			int count=i+1;
			for(int j=0; j<n; j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
	}

}
