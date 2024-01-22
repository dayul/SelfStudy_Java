package chapter_06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car("자가용");
		System.out.println("car1.model: " + car1.model);
		System.out.println();
		
		
		Car car2 = new Car("택시", "주황색");
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
	}

}

