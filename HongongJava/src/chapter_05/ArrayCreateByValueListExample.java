package chapter_05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		int sum = add(new int[] {83, 90, 87});
		
		System.out.println("총합 : " + sum);
		
	}	// main
	
	public static int add(int scores[]) {
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	} // add
}
