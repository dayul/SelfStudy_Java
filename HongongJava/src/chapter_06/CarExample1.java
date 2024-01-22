package chapter_06;

public class CarExample1 {

	public static void main(String[] args) {
		
		Car1 myCar = new Car1();
		
		myCar.setGas(5);	
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {		// true이면 if문 실행
			System.out.println("gas 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
		
		
		
	}

}
