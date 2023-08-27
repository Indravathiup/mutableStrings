package com.kodnest.mutableStrings;

public class String2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("sachin is a batsman");
		System.out.println(sb.capacity());
		sb.append("he lives in mumbai");
		System.out.println(sb.capacity());
		StringBuffer strb=new StringBuffer();
		System.out.println(strb.capacity());
		strb.append("saurav is a batsman");
		System.out.println(strb.capacity());
		strb.append("he lives in mumbai");
		System.out.println(strb.capacity());
		
	}

}
