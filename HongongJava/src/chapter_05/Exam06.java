package chapter_05;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 선택 미션
		
		boolean run = true;
		int studentNum = 0;
		int scores[] = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {				// 학생 수 입력
				System.out.print("학생 수 > ");
				studentNum = Integer.parseInt(sc.nextLine());;
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {		// 점수 입력
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[ " + i + "] > " );
					scores[i] = Integer.parseInt(sc.nextLine());;
					System.out.println();
				}
			}
			else if(selectNo == 3) {		// 점수 리스트 보기
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[ " + i + "] > " );
					System.out.println(scores[i] + "\n");
				}
			}
			else if(selectNo == 4) {		// 최고 점수, 평균 점수 구하기
				int sum = 0;
				int max = 0;
				for(int score : scores) {
					sum += score;
					if(max < score)		
						max = score;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)sum / scores.length);
			}
			else if(selectNo == 5) {		// 프로그램 종료
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
