package com.BasicJava;

public class SingleDimensional 
{

	public static void main(String[] args)
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		//dataType ArrayName[] = new dataType[size];
		//dataType []ArrayName = new dataType[size];
		
		// index of array starts with 0
		int x[] = new int[3];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		
		/*System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[0]);*/
		
		//for(int i=0;i<3;i++)
		for(int i=0;i<x.length;i++)
		{
			System.out.println(i+" "+x[i]);
		}
		

	}

}
