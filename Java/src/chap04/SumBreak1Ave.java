package chap04;

import java.util.Scanner;

public class SumBreak1Ave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		int n = scanner.nextInt();
		int sum = 0;
		int input;
		int i; 
		for (i=0; i<n; i++) {
			input = scanner.nextInt();
			if (input == 0) {
				break;
			}
			else {
				sum += input;
			}
			 
		}
		int avg = sum / i;
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");
		scanner.close();

	}

}
