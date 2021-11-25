package chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(random.nextInt(11) - 5 + x);
		scanner.close();
	}

}
