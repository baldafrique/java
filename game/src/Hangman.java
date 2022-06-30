import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
	
	String hiddenString; // 숨겨진 문자열(문제)
	StringBuffer inputString; // 플레이어가 입력한 문자들의 모임
	StringBuffer outputString; // 플레이어의 입력에 따른 결과로 보여줄 문자열
	int remainder; // 맞힐 문자열(몾 맞히고 남아있는 문자의 수)
	int failed; // 실패한 횟수
	
	public Hangman() {
		hiddenString = "hello";
	}
	
	protected int playGame() throws IOException {
		inputString = new StringBuffer();
		outputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		
		for (int i = 0; i < hiddenString.length(); i++) {
			outputString.append('-');
		}
		
		System.out.println("\n단어(" + hiddenString.length() + "글자" + ") : " + outputString);
		
		drawMan(); // 교수대 그리기
		
		do {
			checkChar(readChar());
			System.out.println("\n단어(" + hiddenString.length() + "글자" + ") : " + outputString);
			drawMan();
		} while ((remainder > 0) && (failed < 6));
		
		return failed;
	}
	
	public void checkChar(char guess) {
		boolean already = false;
		boolean success = false;
		
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == guess) {
				System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요.");
				already = true;
			}
		}
		
		if (!already) {
			inputString.append(guess);
			
			for (int i = 0; i < hiddenString.length(); i++) {
				if (hiddenString.charAt(i) == guess) {
					outputString.setCharAt(i, guess);
					remainder--;
					success = true;
				}
			}
			
			if (!success) {
				failed++;
			}
		}
		
	}
	
	private void drawMan() {
		System.out.println("   ┌────┐");
	    System.out.println("   │    │");
	    
	    switch(failed){
	      case 0:
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 1:
	        System.out.println("   ○    │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 2:
	        System.out.println("   ○    │");
	        System.out.println("  ┌┼    │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 3:
	        System.out.println("   ○    │");
	        System.out.println("  ┌┼    │");
	        System.out.println("   │    │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 4:
	        System.out.println("   ○    │");
	        System.out.println("  ┌┼┐   │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 5:
	        System.out.println("   ○    │");
	        System.out.println("  ┌┼┐   │");
	        System.out.println("   │    │");
	        System.out.println("  ┌┴    │");
	        System.out.println("  │     │");
	        System.out.println("        │");
	        break;
	      case 6:
	        System.out.println("   ○    │");
	        System.out.println("  ┌┼┐   │");
	        System.out.println("   │    │");
	        System.out.println("  ┌┴┐   │");
	        System.out.println("  │ │   │");
	        System.out.println("        │");
	        break;
	    }
	}
	
	public char readChar() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1 문자를 입력하세요: ");
		return in.readLine().charAt(0);
	}
	
	public static void main(String[] args) throws IOException {
		Hangman hangman = new Hangman();
		
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
