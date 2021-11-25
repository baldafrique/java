package chap02;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double width = scanner.nextDouble();
		double height = scanner.nextDouble();
		System.out.println(width * height / 2);
		scanner.close();
	}

}
