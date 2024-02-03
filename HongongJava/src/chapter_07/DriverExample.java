package chapter_07;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dri = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		// 자동 타입 변환
		
		dri.drive(bus);
		// Vehicle vehicle = bus;
		
		dri.drive(taxi);
		// Vehicle vehicle = taxi;

	}

}
