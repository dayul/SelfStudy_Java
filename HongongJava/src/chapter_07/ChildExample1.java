package chapter_07;

public class ChildExample1 {

	public static void main(String[] args) {
		
		Parent1 par1 = new Child1();
		par1.field1 = "data1";
		par1.method1();
		par1.method2();
		
//		부모 클래스 안에 있는 것만 사용 가능 (자동 타입 변환)
//		par1.field2 = "data2";
//		par1.method3();
		
		Child1 chi1 = (Child1) par1;	// 강제 타입 변환
		chi1.field2 = "yyy";
		chi1.method3();
		
	}

}
