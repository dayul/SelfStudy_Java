package chapter_06;

public class Car3Example {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);	// 0
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
