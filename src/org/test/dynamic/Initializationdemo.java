package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initializationdemo {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		InputStreamReader in=new InputStreamReader(System.in); //Input Stream Activation
		BufferedReader ob=new BufferedReader(in);              //Buffer Activation
		
		long a,b;  // Variable Declaration
		float c,d;
		double x,y;
		String name;
	
		System.out.println("Enter your name:");
		name=ob.readLine();
		
		System.out.println("Enter value of c:");
		c=Float.parseFloat(ob.readLine());
		
		System.out.println("Enter value of d:");
		d=Float.parseFloat(ob.readLine());
		
		System.out.println(c+d);
		
		System.out.println("Enter value of x:");
		x=Double.parseDouble(ob.readLine());
		
		System.out.println("Enter value of y:");
		y=Double.parseDouble(ob.readLine());
		
		
		System.out.println(x+y);
		System.err.println("This is an example of error Stream");
	}

}