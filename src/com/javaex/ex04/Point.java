package com.javaex.ex04;

public class Point {  //equals() , hashCode() 재정의
	
	
	//필드
	private int x;
	private int y;
	
	//생성자

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 getter setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	//메소드 일반
	
	public void showInfo() {
		System.out.println("x: "+ x + ",  y: " + y);
	}

	@Override //단축키로 불러옴 x,y로  hashCode와 equals를 같이 만듬
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		//참고: if문의 괄호 안의 내용이 1줄인 경우 괄호 생략가능
		
		if (this == obj)  //같은 인스턴스일때
			return true;
		if (obj == null) //비교대상이 없을때
			return false;
		if (getClass() != obj.getClass()) //Point Circle 비교할때
			return false;
		
		Point other = (Point) obj;
		//변경 (코드에 다라서는 자동으로 만들어지는것에서 변경 필요)
		if (this.hashCode() == other.hashCode()) { //해시코드가 같으면
			if(this.x == other.x && this.y == other.y) { //세부적으로 비교
				return true;
			}else{
				return false;
			}
		}else { //해시코드가 다르면
			return false; //다르다
		}
			
	}
	
	/*
	//주소값 대용, 변경해서 사용할 수 있다. 
	public int hashCode() {
		return x+y;
	}

	@Override //주소값이 같으면 같다고 재정의
	public boolean equals(Object obj) {
		if(this.hashCode() == ((Point)obj).hashCode()) {
			if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	*/
	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	
	
}
