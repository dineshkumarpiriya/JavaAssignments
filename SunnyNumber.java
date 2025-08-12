package com.loopingstatements;

public class SunnyNumber {
	public static void main(String[] args) {
		 
	 
	
	int a=15;
	int n=a+1;
	boolean isSunny=false;
	for (int i=1;i<=n;i++) {
		if (i*i==n) {
			isSunny=true;
			break;
		}
	}
	
if(isSunny) {
	System.out.println("Sunny number");

}	
else {
	System.out.println("not a sunny number");

}
}
}





