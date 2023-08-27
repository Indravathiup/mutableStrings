package com.kodnest.mutableStrings;


public class String1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		StringBuffer strb=new StringBuffer("Ravana");
		System.out.println(strb);
		strb.append("Asura");
		System.out.println(strb);
	}

}
