package com.BasicJava;

public class MultiDimensional {

	public static void main(String[] args) 
	{
		//dataType ArrayName[][] = new dataType[size][size];
		//dataType [][]ArrayName = new dataType[size][size];
		
		String x[][] = new String[2][2];
		
		x[0][0] = "Prashanth";
		x[0][1] = "Hello";
		
		x[1][0] = "Ram";
		x[1][1] = "Hii";
		
			
	//	System.out.println(x[1][0]);
		
		//for(int i=0;i<2;i++) // Row
		for(int i=0;i<x.length;i++)
		{
			//for(int j=0;j<2;j++) // of every Row - it iterates for all the columns
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
