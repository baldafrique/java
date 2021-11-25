package chap02;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.1416;
		double r = scanner.nextDouble();
		
		System.out.println("겉넓이는 " + 4 * PI * r * r + "입니다.");
		System.out.println("부피는 " + (double)4 / 3 * PI * r * r * r + "입니다.");
		scanner.close();
	}

}
