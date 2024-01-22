package chapter_06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int plus = myCalc.plus(3,5);
		System.out.println(plus);
		
		byte x = 10;
		byte y = 4;
		double divide = myCalc.divide(x, y);
		System.out.println(divide);
		
		myCalc.powerOff();

	}

}
