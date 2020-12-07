package com.javaex.ex06;

public class WapperApp {

	public static void main(String[] args) {
		Integer n01 = new Integer(23);
		Integer n02 = new Integer(100);
		
		Integer sum = n01 + n02;
		System.out.println(sum);
		
		Integer sum2 =new Integer(50) + new Integer(51);
		System.out.println(sum2);
		
		int num = 123;
		
		Integer i01 = 23; //박싱
		i01.parseInt("12313"); //박싱 메소드가 포함
		
		
		int no = n02; //언박싱
		
		//박싱이랑 언박싱은 자동 일어난다.
		
		//메소드 사용 (Integer예제)
		int result = i01.parseInt("12345");
		System.out.println(result);
		
		//이상한점
		//"13579" --> 정수 13579 숫자로 변경
		
		Integer n03 = new Integer("11111");
		int result01 = n03.parseInt("13579");
		
		int result02 = Integer.parseInt("13579");
		System.out.println(result02);
		
		//정수를 문자열
		//12345 --> "12345"
		
		String result03 = String.valueOf(12345);
		System.out.println(result03);
		
		String result04 = "";
		
		
		
	}

}
