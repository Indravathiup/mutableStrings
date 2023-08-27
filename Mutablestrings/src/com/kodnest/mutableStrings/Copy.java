package com.kodnest.mutableStrings;

import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		char arr1[]=new char[10];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.next().charAt(0);
		}
		char arr2[]=new char[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("contents in array 1");
		for(char c:arr1)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("contents in array 2");
		for(char x:arr2)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		char arr3[]=new char[arr2.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[j]=arr2[i];
			j--;
	}
		System.out.println("array contents in reverse direction");
		for(char b:arr3)
		{
			System.out.print(b+" |");
		}

}
}
