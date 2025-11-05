package com.patterns;
import java.util.Scanner;
public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows");
		int n = sc.nextInt();
		invertedPyramid(n);
		sc.close();
	}
	public static void invertedPyramid(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
