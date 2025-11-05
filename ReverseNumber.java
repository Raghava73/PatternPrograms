package com.patterns;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
	    reverse(n,original);
		

	}
	public static void reverse(int n, int original){
		int rev=0;
		while(n!=0) {
			int temp;
			
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reverse Number");
		System.out.println(rev);
		if(original==rev) {
			System.out.println(original + " is" +" Palindrome");
		}
		else {
			System.out.println(rev + " is" + " Not Palindrome");
		}
	}
	

}
