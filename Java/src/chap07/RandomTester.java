package chap07;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
	
	public static int random(int a, int b) {
		Random random = new Random();
		if (b <= a) return a;
		else return random.nextInt(b - a + 1) + a;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		System.out.println(random(min, max));
		scanner.close();
		
	}

}
