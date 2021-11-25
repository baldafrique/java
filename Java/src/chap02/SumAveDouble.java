package chap02;

import java.util.Scanner;

public class SumAveDouble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		System.out.println(x + y);
		System.out.println((x + y) / 2);
		scanner.close();
	}

}
