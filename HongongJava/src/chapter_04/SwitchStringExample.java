package chapter_04;

public class SwitchStringExample {

	public static void main(String[] args) {
		// char, int 타입으로도 switch문 모두 가능
		String position = "학생";
		
		switch(position) {
			case "학생" :
				System.out.println("학생 입니다.");
				break;
				
			case "선생님" :
				System.out.println("선생님 입니다.");
				break;
				
			default :
				System.out.println("학부모 입니다.");
		}

	}

}
