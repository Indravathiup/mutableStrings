package com.kodnest.mutableStrings;

public class InturnString {
	public static void main(String[] args) {
		String s1=new String("Raja Ram Mohan Roy");
		System.out.println(s1.length());
		s1=s1.replace('R','A');
		System.out.println(s1);
		s1=s1.replaceAll("Aaja","Raja");
		System.out.println(s1);
		System.out.println("=======================================");
		String str=new String("omkar");
		String str1=str.intern();
		System.out.println(str1);
		String str2="omkar";
		if(str1==str2)
		{
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references are unequal");
		}
		String string=new String("Ravana Brahma");
		char[]arr=string.toCharArray();
		System.out.println("arr------>");
		int i=0;
		do
		{
			System.out.print(arr[i]+" |");
			i++;
		}
		while(i<=arr.length-1);
	}

}
