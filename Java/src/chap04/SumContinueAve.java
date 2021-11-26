package chap04;

import java.util.Scanner;

public class SumContinueAve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?: ");
		int n = scanner.nextInt();
		int sum = 0;
		int value;
		int count = 0;
		
		for (int i=0; i<n; i++) {
			value = scanner.nextInt();
			if (value < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			else {
				sum += value;
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(sum / count);
		scanner.close();
	}

}
