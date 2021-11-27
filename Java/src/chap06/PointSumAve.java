package chap06;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("사람 수: ");
		int n = scanner.nextInt();
		int sum = 0;
		int min = 100;
		int max = 0;
		double avg;
		
		int[] points = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("점수를 입력하세요.");
			System.out.print((i + 1) + "번의 점수: ");
			points[i] = scanner.nextInt();
			sum += points[i];
			
			if (max < points[i]) max = points[i];
			if (min > points[i]) min = points[i];
		}
		
		avg = (double)sum / n;
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
		scanner.close();
	}

}
