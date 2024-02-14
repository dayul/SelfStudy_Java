package chapter_09;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		 arg = 10;			  접근 불가
//		 localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
//		 arg = 10;			   마찬가지로 접근 불가
//		 localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
