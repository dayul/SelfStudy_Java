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
			
			if(selectNo == 1) {				// 1. 학생 수 입력
				System.out.print("학생 수 > ");
				studentNum = sc.nextInt();		// 학생 수를 입력받음
				scores = new int[studentNum];	// 받은 학생 수로 점수 배열 생성
			}
			else if(selectNo == 2) {		// 2. 점수 입력
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[ " + i + "] > " );	
					scores[i] = sc.nextInt();	// 학생 수 만큼 점수 입력받음
					System.out.println();
				}
			}
			else if(selectNo == 3) {		// 점수 리스트 보기
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[ " + i + "] > " );
					System.out.println(scores[i] + "\n");	// 입력받은 점수 출력
				}
			}
			else if(selectNo == 4) {		// 최고 점수, 평균 점수 구하기
				int sum = 0;	// 총합
				int max = 0;	// 최고 점수
				for(int score : scores) {
					sum += score;	// 총합에 점수를 누적
					if(max < score)		
						max = score;	// max보다 클 경우 값을 바꿔줌
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)sum / scores.length);	// 평균점수 구하기
			}
			else if(selectNo == 5) {		// 프로그램 종료
				run = false;	// false로 while문을 빠져나감
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
