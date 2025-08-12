package com.arrays;

import java.util.Arrays;

public class IntersectionElements {

	public static void main(String[] args) {
		int[] a= {5,6,8,2,10};
		int[] b= {2,7,4,5,5,5,5,5};
		// find the count of intersection elements
		int count=0;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
					break; // to avoid duplicates
					// it breaks the current loop of j=0 and starts fresh from i=1 and j=0
				}
			}
		}
		
		//using count..print result array
		
		int x=0;
		int[] result=new int[count];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					result[x]=a[i];
					x++;
					break;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(result));
	}
}
