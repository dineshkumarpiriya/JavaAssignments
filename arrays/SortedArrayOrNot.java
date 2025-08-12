package com.problemsolving;

public class SortedArrayOrNot {
	public static void main(String[] args) {
		int[] a= {0,1,10,20,30,40};
		boolean isSorted=true;
		for (int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("sorted array");
		}
		else {
			System.out.println("unsorted array");

		}
	}

}
