package chapter_09;

public class Button {
	
	OnClickListener listener;	// 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {		// 매개변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();		// 구현 객체의 메소드 호출
	}
	
	static interface OnClickListener {		// 중첩 인터페이스
		void onClick();		
	}

}
