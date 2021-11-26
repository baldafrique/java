package chap04;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int t;
		
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		
		while (a <= b) {
			System.out.println(a++);
		}
		
		scanner.close();
	}

}
