package com.kodnest.mutableStrings;

public class Palindrome2 {
	boolean isPalindrome(String str)
	{
		char[]arr1=str.toCharArray();
		char[]arr2=new char[arr1.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[j];
			j--;
		}
		String str2=new String(arr2);
		System.out.println("string before reversing===> "+str2);
		if(str.equalsIgnoreCase(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
