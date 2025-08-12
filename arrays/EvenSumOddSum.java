package com.arrays;
import java.util.Scanner;

//sum of even numbers and odd numbers in a given array
public class EvenSumOddSum {
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		int[] arr= {3,6,8,5,10};
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			}
		}
		System.out.println("even sum :"+evenSum);

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("odd sum :"+oddSum);
		
		if(evenSum>oddSum) {
			System.out.println("even sum is greater than odd sum");

		}
		else {
			System.out.println("odd sum is greater than even sum");

		}
	}
}
