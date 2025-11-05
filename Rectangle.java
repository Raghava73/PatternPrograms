package com.patterns;
import java.util.*;
public class Rectangle {
	public static void rectanglePattern(int n){
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print("*"+" ");			
				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number for Pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		rectanglePattern(n);
		sc.close();

	}

}
