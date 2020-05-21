package com.javaex.ex01;

public class Customer extends Person {
	// 필드
	private int cNo;
	private int point;

	// 생성자
	public Customer() {
	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	// getter / setter
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// toString

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", name=" + name + ", hp=" + hp + "]";
	}
	
	//메소드
	public void showInfo () {
		System.out.println("#이름: " + name + ", #핸드폰: " + hp + ", #고객번호: " +cNo + ", #포인트점수: " + point );
	}
	
}