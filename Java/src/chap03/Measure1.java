package chap03;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a % b == 0) System.out.println(b +"는 " + a + "의 약수이다.");
		else System.out.println(b + "는 " + a + "의 약수가 아니다.");
		scanner.close();
	}

}
