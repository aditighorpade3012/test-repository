package com.data.input;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
	
		Scanner ob=new Scanner(System.in);
		long a,b;
		float c,d;
		String name;
		System.out.println("enter value of a:");
		a=ob.nextLong();//For Long input
		
		System.out.println("enter value of b:");
		b=ob.nextLong();
		
		System.out.println("enter value of c:");
		c=ob.nextFloat();//for float input
		
		System.out.println("enter value of d:");
		d=ob.nextFloat();
		
		System.out.println("enter your name:");
		name=ob.next();//String input
		
		System.out.println("Addition = "+(a+b));
		System.out.println("Addition = "+(a+b));
		System.out.println(name);
		ob.close();//closing the resource
	}

}
