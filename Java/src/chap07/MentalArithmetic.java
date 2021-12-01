package chap07;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int x, y, z, sum, value, input;
		String formula;
		
		Outer:
			while (true) {
				x = random.nextInt(900) + 100;
				y = random.nextInt(900) + 100;
				z = random.nextInt(900) + 100;
				sum = x;
				
				if (random.nextInt(2) == 0) {
					formula = x + " + ";
					sum += y;
				}
				else {
					formula = x + " - ";
					sum -= y; 
				}
				if (random.nextInt(2) == 0) {
					formula += y + " + " + z;
					sum += z;
				}
				else {
					formula += y + " - " + z;
					sum -= z; 
				}
				formula += " = ";
				
				while (true) {
					System.out.print(formula);
					value = scanner.nextInt();
					
					if (value == sum) {
						System.out.print("Correct! Once again?<Yes...1/No...0>: ");
						input = scanner.nextInt();
						if (input == 0) break Outer;
						else break;
					}
					else {
						System.out.println("Wrong!");
						continue;
					}
				}
			}
		
		scanner.close();
	}

}
