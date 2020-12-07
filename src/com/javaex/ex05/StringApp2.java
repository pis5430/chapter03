package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		 // cancat()
		
		System.out.println(a.concat(b)); // a와 b를합쳐서 표시
		System.out.println(a); //실제로 a값이 변한게 아님 -->a 변하지 않음

		a = a.concat(b);
		System.out.println(a); //a값 변함
		
		
		//trim()
		a = a.trim(); //공백을 지워줌
		System.out.println(a);
		System.out.println("___"+a+"___"); //뒤 공백 확인용
		
		a = a.replace("ab", "12,"); // a의 ab를 12로 바꿔라 , 문자열 갯수는 상관없음
		System.out.println(a);
		
		System.out.println("=======================");
		
		
		String[] sArr = a.split(","); // 를 기준으로 앞뒤로 자르라는 뜻 
		
		for (int i =0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
		String str = "Hwllow java";
		
		String result = str.substring(3); //[3]번방부터 끝까지 출력
		System.out.println(result);
		System.out.println(str);
		
		String result02 = str.substring(3, 7); //[3]번방부터 [7]번방 전까지
		System.out.println(result02);
		
		char c = str.charAt(1); //한글자만 꺼내오기
		System.out.println(c); 
		
		String c2 = str.substring(1,2);
		System.out.println(c2); //return형이 달라서String으로 넣어줘야함
		
		
		
		
		
	}

}
