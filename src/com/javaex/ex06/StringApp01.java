package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {
		
		String str1 = new String("hi");
		String str2 = new String("hi");
		
		System.out.println(str1 == str2); // 주소값이 같냐?
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("=================================");
		
		String str3 = "hello";
		String str4 = "hello";
		
		System.out.println(str3 == str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		str4 = "hello!!!";
		System.out.println(str3 == str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str4);
		System.out.println(str3);

	}

}
