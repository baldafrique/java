package chap07;

import java.util.Scanner;

public class AryRmvN {
	
	private static void aryRmvN(int[] arr, int idx, int num) {
		// [0], [1], [2], [3], [4], [5] length(6) idx(2) num(2) 2<4 3<5
		
		for (int i = idx; i < idx + num; i++) {
			arr[i] = arr[i+num];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the length of array: ");
		int size = scanner.nextInt();
		
		int[] arr = new int [size];
		
		System.out.print("Enter the elements: ");
		for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
		
		System.out.print("Enter start index: ");
		int idx = scanner.nextInt();
		
		System.out.print("Enter the number of elements: ");
		int num = scanner.nextInt();
		
		aryRmvN(arr, idx, num);
		
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		
		scanner.close();
	}


}
