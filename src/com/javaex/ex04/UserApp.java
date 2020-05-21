package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer [] cArray = new Customer[2];
		Customer c01 = new Customer ("jws", "j1234", "정우성", 1000);
		Customer c02 = new Customer ("yjs", "y2345", "이효리", 2000);
		cArray[0] = c01;
		cArray[1] = c02;
		for ( int i = 0; i < cArray.length; i++) {
			cArray[i].showInfo();
		}
		
		Employee [] eArray = new Employee[1];
		Employee e01 = new Employee ("master","m7788","운영자",5000000);
		eArray[0] = e01;
		for (int i = 0; i < eArray.length; i++) {
			eArray[i].showInfo();
		}
		
		
	
	}

}
