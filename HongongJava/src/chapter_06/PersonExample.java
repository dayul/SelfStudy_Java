package chapter_06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123231-313232", "감자바");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// nation, ssn을 수정하려고 하면 error 발생
		p1.name = "박자바";
		
	}

}
