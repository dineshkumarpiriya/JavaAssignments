package com.problemsolving;

// The sum of square root  number must be equal to the given number

public class NeonNumber {
	public static void main(String[] args) {
		
		int n=5;
		int sqrt=n*n;
		int sum=0;
		while(sqrt>0) {
			int digit=sqrt%10;
			sum=sum+digit;
			sqrt/=10;
		}
		if (sum==n) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not a neon number");

		}
	}
	

}
