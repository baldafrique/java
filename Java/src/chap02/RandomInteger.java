package chap02;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		Random random = new Random();
		int n1 = random.nextInt(9) + 1;
		int n2 = -random.nextInt(9) - 1;
		int n3 = random.nextInt(90) + 10;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
