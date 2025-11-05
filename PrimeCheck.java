package com.patterns;
import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		Boolean b = primeCheck(n); //prime number check
		if(b) {
			System.out.println("Yes");	
		}
		else {
			System.out.println("No");
		}
		System.out.println("Enter the Number to Check:");
		int m = sc.nextInt();
		String s = primeNumber(m);//prime number by root method
		System.out.println(s);//returning string 
		
		
		
		//First N Prime Numbers
		firstPrimeNumbers(m);
		System.out.println();
		
		System.out.println("Enter the First Number:");
		int p = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int q = sc.nextInt();
		pToQprime(p,q);
		sc.close();
	}
	public static void pToQprime(int p, int q) {
		// TODO Auto-generated method stub
		for(int i=p; i<=q; i++) {
			if(primeCheck(i)) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	public static void firstPrimeNumbers(int m) {
		// TODO Auto-generated method stub
		for(int i=2; i<=m; i++) {
			if(primeCheck(i)) {
				System.out.print(i+" ");
			}	
		}
	}
	public static Boolean primeCheck(int n) {
		// TODO Auto-generated method stub
		for(int a=2; a<=n/2; a++) {
			if(n%a==0) {
				return false;
			}
		}
		return true;
	}
	public static String primeNumber(int n) {
		// TODO Auto-generated method stub
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}
}
