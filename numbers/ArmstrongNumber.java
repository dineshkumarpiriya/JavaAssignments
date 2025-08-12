package com.problemsolving;

// 153(digits=3)
// so 1 cube of 3 + 5 cube of 3 + 3 cube of 3== 153.........then armstrong number
public class ArmstrongNumber {
	public static void main(String[] args) {
		
//	 n=153;
	

	int n=9474;
	int temp1=n;
	int temp2=n;
	int count=0;
	int sum=0;
	while(n>0) {
		count++;
		n/=10;
	}
	//we will get count value 
	
	while(temp1>0) {
		int digit=temp1%10;
		sum=sum+(int)(Math.pow(digit,count));
		temp1/=10;
	}
	if (sum==temp2) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not an armstrong number");

	}
}
}