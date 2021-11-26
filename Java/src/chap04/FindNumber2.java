package chap04;

import java.util.Random;
import java.util.Scanner;

public class FindNumber2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int value = random.nextInt(100);
		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int input = 0;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		do {
			System.out.print("남은 횟수 " + leftNo-- + "회, 어떤 숫자일까?: ");
			input = scanner.nextInt();
			if (input < value) {
				System.out.println("더 큰 숫자입니다.");
			}
			else if (input > value) {
				System.out.println("더 작은 숫자입니다.");
			}
		} while (input != value && leftNo > 0);
		
		if (input == value) {
			System.out.println(MAX_NO - leftNo + "회만에 맞추었습니다.");
		} 
		else {
			System.out.println("아쉽네요. 정답은 " + value + "입니다.");
		}
		
		scanner.close();
	}

}
