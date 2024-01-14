package chapter_05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {		// 입력 데이터가 2개가 아닐때
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); 		// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);	// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
