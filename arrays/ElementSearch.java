package com.arrays;

public class ElementSearch {
public static void main(String[] args) {
	int[] arr= {1,3,5,10,6};
	int target=10;
	boolean status=false;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			status=true;
			break;
		}
		
	}
	if(status) {
		System.out.println(" target found in the array ");
	}
	else {
		System.out.println("target not found");

	}
}
}
