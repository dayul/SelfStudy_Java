package chapter_06;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {};				// 기본 생성자
	
	public Car(String model) {		// 생성자
		this(model, "검정");			// 중복 코드 줄이기
	}
	
	public Car(String model, String color) {	// 생성자 오버로딩
		this.model = model;			// 필드 초기화
		this.color = color;
	}
	
}
