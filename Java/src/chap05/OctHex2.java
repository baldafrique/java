package chap05;

import java.util.Scanner;

public class OctHex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.printf("%o\n", x);
		System.out.printf("%x\n", x);
		System.out.printf("%8.5f", -1.45);
		scanner.close();
	}

}
