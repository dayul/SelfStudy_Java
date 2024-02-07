package chapter_08;

public class DriverExample1 {

	public static void main(String[] args) {
		
		Driver1 dri = new Driver1();
		
		Bus1 bus = new Bus1();
		Taxi taxi = new Taxi();
		
		dri.drive(bus);
		dri.drive(taxi);

	}

}
