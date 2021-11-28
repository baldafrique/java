package chap06;

import java.util.Random;
import java.util.Scanner;

public class MonthCAI {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int input = 1;
		int last = -1;
		int index;
		String answer;
		
		do {
			answer = "";
			do {
				index = random.nextInt(12) + 1;
			} while (last == index);
			
			while (!answer.equals(months[index - 1])) {
				System.out.print(index + "월: ");
				answer = scanner.next();
				if (!answer.equals(months[index - 1])) {
					System.out.println("틀렸습니다.");
					continue;
				}
			}
			
			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
			input = scanner.nextInt();
		} while (input == 1);
		
		scanner.close();
	}

}