package chapter_07;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
/*	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	} */	
	// final 메소드이므로 재정의(오버라이딩)를 할 수 없음
}
