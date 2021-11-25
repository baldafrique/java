package chap02;

import java.util.Scanner;

public class ScanInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt() + "를 입력했습니다.");
		scanner.close();
	}

}
