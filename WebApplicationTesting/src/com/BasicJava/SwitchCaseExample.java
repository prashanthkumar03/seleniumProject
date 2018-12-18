package com.BasicJava;

public class SwitchCaseExample
{

	public static void main(String[] args) 
	{
		int number = 30;
		
		switch(number)
		{
		case 10:
			System.out.println("not matching");
			break;
		case 20:
			System.out.println("not matching");
			break;
			
		case 30:
			System.out.println("yes matching");
			break;
			
		default:
			System.out.println("not at all matching");
			break;
				
		}
	}

}
