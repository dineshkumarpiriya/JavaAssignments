package com.scanner;
import java.util.Scanner;
public class ScannerExample {
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter any byte value");
	 byte b=sc.nextByte();
	 System.out.println(b);
	 
	 System.out.println("enter any short value");
	 short s=sc.nextShort();
	 System.out.println(s);

	 
	 System.out.println("enter any int value");
	 int i=sc.nextInt();
	 System.out.println(i);

	 
	 System.out.println("enter any long value");
	 long l=sc.nextLong();
	 System.out.println(l);

	 
	 System.out.println("enter any floating value");
	 float f=sc.nextFloat();
	 System.out.println(f);

	 
	 System.out.println("enter any double value");
	 double d=sc.nextDouble();
	 System.out.println(d);

	 
	 System.out.println("enter any boolean value");
	 boolean boo=sc.nextBoolean();
	 System.out.println(boo);

//	 
//	 System.out.println("enter any char value");
//	 char ch=sc.next().charAt(0);
//	 System.out.println(ch);

	 String str=sc.next();
	 char ch=str.charAt(0);
	 System.out.println(ch);
	 
	 System.out.println("enter any String value");
	 String str1=sc.next();
	 System.out.println(str1);
	 sc.nextLine();
	 
	 System.out.println("enter any sentence");
	 String str2=sc.nextLine();
	 System.out.println(str2);

	 
	 
	 
	 
//	 System.out.println("Enter any string value");
//	 String str= sc.next();
//	 char ch=str.charAt(0);
//	 System.out.println((int)ch);
	 sc.close();
 }
}
