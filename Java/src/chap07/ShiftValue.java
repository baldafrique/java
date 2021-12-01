package chap07;

import java.util.Scanner;

public class ShiftValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(x * (int)Math.pow(2, n));
		System.out.println(x / (int)Math.pow(2, n));
		System.out.println(x << n);
		System.out.println(x >> n);
		
		scanner.close();
	}

}
