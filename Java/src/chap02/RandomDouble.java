package chap02;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble() * 10);
		System.out.println(random.nextDouble() * 2 - 1);
	}

}
