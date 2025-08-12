package com.problemsolving;

public class HarshadNumber {

	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18;
		int temp=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=digit;
			n/=10;
			
		}
		if(temp%sum==0) {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("not an Harshad number");

		}
	}

}
