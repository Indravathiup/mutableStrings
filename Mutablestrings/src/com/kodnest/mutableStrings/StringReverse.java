package com.kodnest.mutableStrings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.nextLine();
		System.out.println(s1+" ");
		char[] arr1=s1.toCharArray();
		System.out.println("before reverse");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		char arr2[]=new char[arr1.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
		arr2[i]=arr1[j];
		j--;
	}
		System.out.println();
		System.out.println("After reverse order");
		 s1=new String(arr2);
		 System.out.println(s1);
	}
		 

}
