import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Hangman2 extends Hangman {
	
	String[] words = {"influenza",
					"fever",
					"cancer",
					"poison",
					"victim",
					"physician",
					"clinic",
					"symptom",
					"medicine",
					"drug",
					"hygiene"};
	
	String[] meaning = {"독감",
					"열",
					"암",
					"독",
					"환자",
					"내과의사",
					"진료소",
					"징후",
					"의학",
					"약",
					"위생학"};
	
	public char readChar() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char user;
		
		do {
			System.out.print("한글자를 입력하세요(힌트를 원하면 ? 입력): ");
			user = in.readLine().charAt(0);
			
			if (user == '?') {
				boolean givehint = false;
				int i = 0;
				while (!givehint) {
					if (outputString.charAt(i) == '-') {
						System.out.println();
						System.out.println("힌트: " + hiddenString.charAt(i));
						System.out.println();
						failed++;
						givehint = true;
					}
					i++;
				}
			}
		} while (user == '?');
		
		return user;
	}
	
	public Hangman2() {
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt() % words.length);
		hiddenString = words[randomNum];
		System.out.println("\n의미: " + meaning[randomNum]);
	}
	
	public static void main(String[] args) throws IOException {
		Hangman2 hangman = new Hangman2();
		int result = hangman.playGame();
		
		System.out.println();
		if (result <= 2) {
			System.out.println("참 잘했어요!");
		}
		else if (result <= 3) {
			System.out.println("잘했어요!");
		}
		else if (result <= 4) {
			System.out.println("보통이네요!");
		}
		else {
			System.out.println("분발하세요!");
		}
	}

}
