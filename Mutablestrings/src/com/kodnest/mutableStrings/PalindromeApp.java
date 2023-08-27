package com.kodnest.mutableStrings;

import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.nextLine();
		System.out.println("string before reversing===> "+s1);
		Palindrome p=new Palindrome();
		boolean res=p.isPalindrome(s1);
		if(res==true)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}

}
