package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		
		//equals()성능향상
		
		// x+y --> 주소값이라고 정의
		// x+y --> 주소값을 만들고 주소값이 다르면  다르다고 "결론"
		Point p = new Point(2,3); // --> 주소값 5
		Point p01 = new Point(3,2); // --> 주소값 5
		Point p02 = new Point(5,8); // --> 주소값 13
		
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println(p.equals(p01)); //p랑 p01이 같은지 비교
		
		
		
		

	}

}
