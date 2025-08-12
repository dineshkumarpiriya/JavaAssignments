package com.problemsolving;

import java.util.Scanner;
public class TwinPrimes {
	public static boolean isPrime(int n) {
		
	if(n<2) {
		return false;
	}
		if(n>2) {
			
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
			}
				}
		}
		return true;
			
	}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter n2");
		int n2=sc.nextInt();
		
		if(isPrime(n1)&&isPrime(n2)) {
			if(((n1+2)==n2)||((n1-2)==n2)) {
				System.out.println(n1+" and "+ n2+" are twin primes");
			}
			else {
				System.out.println(n1+" and"+n2+" are prime but not twin primes");
			}
		}
		else {
			System.out.println("not prime numbers");
		}
		

		

		
			
		
	}
	

}
