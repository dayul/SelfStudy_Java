package chapter_02;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);	// 키코드를 하나씩 읽는다는 단점
			
			if(keyCode == 113) break;
		}
		
		System.out.println("종료");

	}

}
