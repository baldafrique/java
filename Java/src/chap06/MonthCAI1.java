package chap06;

import java.util.Random;
import java.util.Scanner;

public class MonthCAI1 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
		String[] dayEnglish = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		int input = 1;
		int last = -1;
		int index;
		String answer;
		
		do {
			answer = "";
			do {
				index = random.nextInt(7) + 1;
			} while (last == index);
			
			while (!answer.equals(dayEnglish[index - 1])) {
				System.out.print(dayKorean[index - 1] + ": ");
				answer = scanner.next();
				if (!answer.equals(dayEnglish[index - 1])) {
					System.out.println("틀렸습니다.");
					continue;
				}
				last = index;
			}
			
			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
			input = scanner.nextInt();
		} while (input == 1);
		
		scanner.close();
	}

}
