package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaPerimeterCircle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double area,perimeter,radius;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the Radius ");
        radius=Double.parseDouble(ob.readLine());
       
        area=3.14*radius*radius;
        System.out.println("Area of the circle is: "+area);
        perimeter=2*3.14*radius;
        System.out.println("Perimeter of the circle is: "+perimeter);
	}

}

