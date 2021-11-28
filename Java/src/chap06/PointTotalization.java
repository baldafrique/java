package chap06;

import java.util.Scanner;

public class PointTotalization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[][] score  = new int[number][2];
		double[] studentAvg = new double[number];
		double koreanAvg = 0;
		double mathAvg = 0;

		System.out.println(number + "명의 국어, 수학 점수를 입력하세요.");
		
		for (int i = 0; i < number; i++) {
			score[i][0] = scanner.nextInt();
			score[i][1] = scanner.nextInt();
			studentAvg[i] = (double)(score[i][0] + score[i][1]) / 2;
			koreanAvg += score[i][0];
			mathAvg += score[i][1];
		}
		
		koreanAvg /= number;
		mathAvg /= number;
		
		System.out.println("번호	국어	수학	평균");
		for (int i = 0; i < number; i++) {
			System.out.println(i+1 + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + studentAvg[i]);
		}
		System.out.printf("평균\t%.1f\t%.1f", koreanAvg, mathAvg);
		
		scanner.close();
	}

}
