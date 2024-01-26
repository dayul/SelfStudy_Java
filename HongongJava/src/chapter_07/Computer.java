package chapter_07;

public class Computer extends Calculator {
	@Override	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;		// 자바 표준 API
	}
}
