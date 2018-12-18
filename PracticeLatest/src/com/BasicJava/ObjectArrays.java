package com.BasicJava;

public class ObjectArrays {

	public static void main(String[] args)
	{
		//object ArrayName[] = new object[size];
		
		Object a[] = new Object[3];

		a[0] = 10;
		a[1] = "Hello";
		a[2] = 10.123;
		
		// for each loop
		
		for(Object var:a)
		{
			System.out.println(var);
		}
		
	}

}
