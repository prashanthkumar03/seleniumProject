package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		//List<dataType>ArrayName = new ArrayList<>();
		
				List<String>a = new ArrayList<>();
				
				a.add("prashanth");
				a.add("Hello");
				a.add("pra");
				a.add("show");
				
				//System.out.println(a.get(1));
				
				for(int i=0; i<a.size();i++)
				{
					System.out.println(a.get(i));
				}

	}

}
