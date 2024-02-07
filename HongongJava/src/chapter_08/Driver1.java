package chapter_08;

public class Driver1 {

	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus1) {
	    	Bus1 bus = (Bus1) vehicle;
	    	bus.checkFare();
	    }
		
		vehicle.run();
	}
}
