package org.test.dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double p,r,t,i;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the principle amount:");
        p=Double.parseDouble(ob.readLine());
        
        System.out.println("Enter the interest amount:");
        r=Double.parseDouble(ob.readLine());
        
        System.out.println("Enter the time:");
        t=Double.parseDouble(ob.readLine());
        
        i=(p*r*t)/100;
        System.out.println("Interest="+i);
	}

}
