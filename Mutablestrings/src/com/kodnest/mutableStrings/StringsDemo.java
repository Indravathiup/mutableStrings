package com.kodnest.mutableStrings;

public class StringsDemo {
	public static void main(String[] args) {
		String s1="Indhu";
		System.out.println(s1);
		StringBuilder s2=new StringBuilder("Indhu");
		System.out.println(s2);
		s2.reverse();
		System.out.println(s2);
	}

}
