package chapter_07;

public class StudentExample {

	public static void main(String[] args) {
		
		Student stu = new Student("감자바", "1232142-132341", 1);
		
		System.out.println("name : " + stu.name);
		System.out.println("ssn : " + stu.ssn);
		System.out.println("studentNo : " + stu.studentNo);

	}

}
