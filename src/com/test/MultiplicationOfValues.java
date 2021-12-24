	package com.test;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class MultiplicationOfValues {

		public static void main(String[] args) throws NumberFormatException, IOException {
			
			int x,y;
			BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));//Activate Buffered Stream
			
			System.out.println("Enter the value of x : ");
			x=Integer.parseInt(ob.readLine());                  //read the value from console and will be parsed to Integer

			System.out.println("Enter the value of y : ");
			y=Integer.parseInt(ob.readLine());
			System.out.println(x*y);
		}

	}

