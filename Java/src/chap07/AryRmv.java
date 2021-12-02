package chap07;

import java.util.Scanner;

public class AryRmv {
	
	public static void aryRmv(int[] arr, int idx) {
		for (int i = idx; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int idx = scanner.nextInt();
		
		for (int elem : arr) System.out.print(elem + " ");
		
		aryRmv(arr, idx);
		for (int elem : arr) System.out.print(elem + " ");
		scanner.close();
	}

}
