package chapter_06;

public class Calculator2Example {

	public static void main(String[] args) {
		// static, 정적멤버 (객체 선언을 하지 않아도 사용 가능)
		
		double result1 = 10 * 10 * Calculator2.pi;
		int result2 = Calculator2.plus(10, 5);
		int result3 = Calculator2.minus(10, 5);
		
		System.out.println(result1 + " | " + result2 + " | " + result3);

	}

}
