package com.kodnest.mutableStrings;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char arr[]=new char[10];
		System.out.println("enter the length of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		System.out.println("contents in array");
		for(char a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
