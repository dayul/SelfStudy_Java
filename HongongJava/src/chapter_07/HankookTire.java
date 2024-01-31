package chapter_07;

public class HankookTire extends Tire {
	
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드 (오버라이딩)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.print(location + " HankookTire 수명: ");
			System.out.println(maxRotation - accumulatedRotation + "회");
			return true;
		}
		else {
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
}
