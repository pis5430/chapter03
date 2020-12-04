package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) { //오브젝트를 new로 쓰는경우는 별로 없음
		
		Point p = new Point(2,3);
		//System.out.println(p.toString());
		//System.out.println(p.hashCode());
		//p.getClass();
		
		//Object클래스가 부모이다
		//Object클래스의 메소드 +Point 클래스의 메소드를 사용할 수 있다.
		//겹치는 메소드 주의
		
		
		//테스트 Point 클래스의 toString()을 지운다
		System.out.println(p.toString());

		
		//메소드 오버라이딩
		Object op = new Point();
		System.out.println(op.toString());
		
		//pringtln toSring()찾아서 실행한다.
		System.out.println(p); //주소의 toString()
		
		
	}

}
