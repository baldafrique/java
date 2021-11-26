package chap04;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input, value;
		
		do {
			System.out.print("정숫값: ");
			value = scanner.nextInt();
			if (value > 0) System.out.println("이 값은 양수입니다.");
			else if (value < 0) System.out.println("이 값은 음수입니다.");
			System.out.print("다시 한번? 1-Yes / 0-No: ");
			input = scanner.nextInt();
		}
		while (input == 1);
		scanner.close();
	}

}
