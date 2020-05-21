package com.javaex.ex06;

public class MyBase extends Base {

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void service(String state) {

		if (state == "오후") {
			afternoon();
		} else if (state == "낮"){
			noon();
		}  else if (state =="밤") {
			night();
		}

	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	public void noon() {
		System.out.println("낮에는 열심히 수업을 듣자");
	}
	public void night() {
		System.out.println("밤에는 숙면");
	}
	
	
	
}
