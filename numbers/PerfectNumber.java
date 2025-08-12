package com.loopingstatements;

// the sum of factors excluding the given number should be same to the given number
// 1+2+3=6 sum of factors of 6

public class PerfectNumber {
		
		public static void isPerfect(int n) {
			int sum=0;
			if(n>0) {
			for (int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.println(n+" is a perfect number");
				}
			else {
				System.out.println(n+" is not a perfect number");

			}
		}
			else {
				System.out.println("Enter a number greater than 0");

			}
		}
		public static void main(String[] args) {
			isPerfect(6);
		
	}

}
