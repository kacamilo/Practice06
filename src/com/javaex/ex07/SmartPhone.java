package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	// 메소드작성
	public void execute(String str) {
		if (str == "앱") {
			app();
		} else if (str=="음악") {
			playMusic();
		} else if (str=="통화") {
			call();
		}

	}

	public void app() {
		System.out.println("앱실행");
	}

	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	public void call() {
		System.out.println("통화기능시작");
	}
}
