package chap07;

import java.util.Scanner;

public class PrintSeason {
	
	public static void printseason(int month) {
		switch (month) {
		case 3: case 4: case 5: System.out.println("Spring"); break;
		case 6: case 7: case 8: System.out.println("Summer"); break;
		case 9: case 10: case 11: System.out.println("Autumn"); break;
		case 12: case 1: case 2: System.out.println("Winter"); break;
		default: break;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		printseason(month);
		scanner.close();
	}

}
