package chap03;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int t;
		
		if (a < b) {
			t = a;
			a = b;
			b = t;
		}
		
		System.out.println(a + " " + b);
		scanner.close();
	}

}
