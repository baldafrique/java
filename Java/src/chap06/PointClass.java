package chap06;

import java.util.Scanner;

public class PointClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of Classes: ");
		int classNumber = scanner.nextInt();
		int[] classSum = new int[classNumber];
		double[] classAverage = new double[classNumber];
		int sum = 0;
		double average = 0;
		int studentNumber = 0;
		int[][] scores = new int[classNumber][];
		
		for (int i = 0, j = 0; i < classNumber; i++) {
			System.out.print("Number of students in class" + (i + 1) + ": ");
			j = scanner.nextInt();
			scores[i] = new int[j];
			
			for (int k = 0; k < scores[i].length; k++) {
				System.out.print("Score of student no." + (k + 1) + " in class" + (i + 1) + ": ");
				scores[i][k] = scanner.nextInt();
				classSum[i] += scores[i][k];
				studentNumber++;
			}
			
			sum += classSum[i];
			classAverage[i] = (double)classSum[i] / j;
			System.out.println();
		}
		
		average = (double)sum / studentNumber;
		
		for (int i = 0; i < classNumber; i++) {
			System.out.printf("%d %.1f\n", classSum[i], classAverage[i]);
		}
		
		System.out.printf("%d %.1f\n", sum, average);
		
		scanner.close();
	}

}
