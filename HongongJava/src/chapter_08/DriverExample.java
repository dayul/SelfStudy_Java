package chapter_08;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dri = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		dri.drive(bus);
		dri.drive(taxi);

	}

}
