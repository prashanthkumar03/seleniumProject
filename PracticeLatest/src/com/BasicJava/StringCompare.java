package com.BasicJava;

public class StringCompare
{

	public static void main(String[] args)
	{
		
		String a="Hello";
		String b="hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both strings are not equal ");
		}
		
		System.out.println(" ------  ");
		
		String c="Hello";
		String d="hello";
		
		if(c.equalsIgnoreCase(d))
		{
			System.out.println(" Both strings are equal");
		}
		else
		{
			System.out.println(" Both Strings are not equal ");
		}
		
		System.out.println(" ------  ");
		
		String e="Hello";
		String f="ello";
		
		if(e.equalsIgnoreCase(f))
		{
			System.out.println(" Both strings are equal");
		}
		else
		{
			System.out.println(" Both Strings are not equal ");
		}
		
		System.out.println(" ------  ");
		
		String g="Hello";
		String h="Chello";
		
		if(g.contains(h))
		{
			System.out.println(" Both strings are equal");
		}
		else
		{
			System.out.println(" Both Strings are not equal ");
		}
		
		System.out.println("**************");
		
		String p="Hello";
		String q=" Hello";
		
		if(p.equals(q))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both strings are not equal ");
		}
	}

}
