package chap07;

import java.util.Scanner;

public class SignOf1 {
	
	 public static int signOf(int n) {
		 if (n > 0) return 1;
		 else if (n < 0) return -1;
		 else return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(signOf(x));
		scanner.close();
	}

}
