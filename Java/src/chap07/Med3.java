package chap07;

import java.util.Random;

public class Med3 {
	
	public static int med(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			}
			else if (a <= c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if (a > c) {
			return a;
		}
		else if (b > c) {
			return c;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(5) + 1;
		int b = random.nextInt(5) + 1;
		int c = random.nextInt(5) + 1;
		
		System.out.println(med(a, b, c) + " is the median value in " + a + " " + b + " " + c);
	}

}
