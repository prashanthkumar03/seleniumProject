package com.BasicJava;

public class ObjectArray 
{

	public static void main(String[] args) 
	{
		//Object ArrayName[] = new Object[size];
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Prashanth";
		a[2] = 11.111;
		
		//for each loop
		
		for(Object var:a)
		{
			System.out.println(var);
		}
		

	}

}
