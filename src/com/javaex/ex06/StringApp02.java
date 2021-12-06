package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println(a.toUpperCase()); //대문자로 바꿔준다
		
		System.out.println(a.concat(b)); //문자열 합쳐준다 a + b
		System.out.println(b.concat(a));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println("--"+a+"--"); //왼쪽,오른쪽 공백제거해준다(가운데는 x)
		
		a = a.replace("ab", "12");
		System.out.println(a); //문자열 치환
		
		String[] sArray = a.split(","); // , 를 기준으로 문자열 자르기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3); // 3번째 문자까지 자르기
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8);
		System.out.println(r03);

	}

}
