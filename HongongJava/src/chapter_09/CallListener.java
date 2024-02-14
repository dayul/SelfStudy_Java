package chapter_09;

public class CallListener implements Button.OnClickListener{
	// 구현 클래스
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
