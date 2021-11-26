package chap05;

import java.util.Scanner;

public class OctHex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toHexString(x));
		scanner.close();
	}

}
