package chap06;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Number: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		int key;
		
		for (int i = 0; i < n; i ++) {
			a[i] = scanner.nextInt();
		}
		
		key = scanner.nextInt();
		
		int index1 = -1;
		int index2 = -1;
		
		for (int i = 0; i < n; i++) {
			if (index1 != -1) {
				if (a[i] == key) {
					index2 = i;
				}
			}
			else {
				if (a[i] == key) {
					index1 = i;
				}
			}
		}
		
		if (index2 == -1) {
			System.out.println("그 값은 a[" + index1 + "]에 있습니다.");
		}
		else {
			System.out.println("배열 내 그 값은 a[" + index1 + "]에 가장 먼저 있고");
			System.out.println("배열 내 그 값은 a[" + index2 + "]에 마지막으로 있습니다");
		}
		
		scanner.close();
	}

}
