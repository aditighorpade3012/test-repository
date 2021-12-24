package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {
		int a=56, b=35, c=76, v=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		System.out.println(a!=b);
		System.out.println(a==b);//equlity operator
		
		a+=5;//a=a+5
		System.out.println(a);
		a-=5;//a=a-5
		System.out.println(a);
		a*=2;//a=a*2
		System.out.println(a);
		a/=4;//a=a/4
		System.out.println(a);
		
		System.out.println(a & b);//bitwise and operator
		System.out.println(a | b);//bitwise or operator
		System.out.println(a >> 2);//right shift operator
		System.out.println(a << 2);//left shift operator
		
		System.out.println(++v - ++v - ++v);
		
		int y=(20>30)?20:30;
		System.out.println(y);
		
		String s=(20<30)?"java":"c++";//ternary operator
		System.out.println(s);
		//System.out.println(--x);//10
		//System.out.println(x--);
		
	}

}
