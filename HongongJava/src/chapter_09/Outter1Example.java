package chapter_09;

public class Outter1Example {

	public static void main(String[] args) {
		
		Outter1 outter1 = new Outter1();
		Outter1.Nested nested = outter1.new Nested();
		nested.print();

	}

}
