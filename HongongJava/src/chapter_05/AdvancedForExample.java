package chapter_05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int scores[]  = {95, 96, 97, 99, 100};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
