package chap04;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int value = random.nextInt(90) + 10;
		int input;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		do {
			System.out.print("어떤 숫자일까?: ");
			input = scanner.nextInt();
			if (input > value) System.out.println("더 작은 숫자입니다.");
			else if(input < value) System.out.println("더 큰 숫자입니다.");
		} while (input != value);
		System.out.println("정답입니다.");
		scanner.close();
	}

}
