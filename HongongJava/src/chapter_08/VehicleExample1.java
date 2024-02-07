package chapter_08;

public class VehicleExample1 {

	public static void main(String[] args) {
		
		Vehicle vehi = new Bus1();
		
		vehi.run();
//		vehi.checkFare();  인터페이스에는 checkFare()가 없음
		
		Bus1 bus = (Bus1) vehi;
		bus.run();
		bus.checkFare();

	}

}
