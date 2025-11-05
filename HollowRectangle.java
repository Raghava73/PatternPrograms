package com.patterns;

import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Rows");
		int n = sc.nextInt();
		hollowRectangle(n);
		sc.close();
	}
    public static void hollowRectangle(int n) {
		// TODO Auto-generated method stub
    	 for(int i=0; i<=n;i++) {
    		 for(int j=0; j<=n;j++) {
    			 if(i==0|| i==n ||j==0 || j==n) {
    				 System.out.print("*");
    			 }
    			 else {
    				 System.out.print(" ");
    			 } 
    		 }
    		 System.out.println();
    	 }
		
	}

}
