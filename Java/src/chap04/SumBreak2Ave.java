package chap04;

import java.util.Scanner;

public class SumBreak2Ave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		int n = scanner.nextInt();
		int sum = 0;
		int value, i;
		for (i=0; i<n; i++) {
			 value = scanner.nextInt();
			 if ((sum += value) > 1000) {
				 System.out.println("합계가 1,000을 넘었습니다.");
				 System.out.println("마지막 값은 무시합니다.");
				 sum -= value;
				 scanner.close();
				 break;
			 }
			 else {
				 sum += value;
			 }
		}
		
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + sum / n + "입니다");
		scanner.close();
	}

}
