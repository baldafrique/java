package chap04;

import java.util.Scanner;

public class IsoscelesTriangleLU {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int j=n-i; j>0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		scanner.close();
	}

}