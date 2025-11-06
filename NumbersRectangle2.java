package com.patterns;
import java.util.Scanner;
public class NumbersRectangle2 {
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
		int count=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
	}

}
