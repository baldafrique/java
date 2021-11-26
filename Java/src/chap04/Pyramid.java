package chap04;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j=n-i; j>0; j--) {
				System.out.print(' ');
			}
			for (int j=0; j<(i-1)*2+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		scanner.close();
	}

}
