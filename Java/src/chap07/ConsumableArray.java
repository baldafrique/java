package chap07;

public class ConsumableArray {
	
	public static void print(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		print(new int[] {1, 5, 22});
	}

}
