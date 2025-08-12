package com.problemsolving;

import java.util.Arrays;

public class MoveZerosToLast {
public static void main(String[] args) {
	int[] a= {1,10,23,0,5,0,4,0,0,0};
	int zeroCount=0;
	int numberCount=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==0) {
			zeroCount++;
		}
		else {
			numberCount++;
		}
	}
	int[] zeroArray=new int[zeroCount];
	int[] numberArray=new int[numberCount];
	
	//add numbers to numberArray
	int x=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			numberArray[x++]=a[i];
		}
		
}
	
	
	//add zeros to zeroArray
	int y=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==0) {
			zeroArray[y++]=a[i];
		}	
}
	
//	System.out.println(Arrays.toString(numberArray));
//	System.out.println(Arrays.toString(zeroArray));

	//merge these two arrays
	
	int[] result=new int[zeroArray.length+numberArray.length];
	
	for(int i=0;i<numberArray.length;i++) {
		
		result[i]=numberArray[i];
		
	}
	
	for(int i=0;i<zeroArray.length;i++) {
		
		result[numberArray.length+i]=zeroArray[i];
		
	}
		
		
	System.out.println(Arrays.toString(result));
	
}
}
