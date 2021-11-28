package chap06;

public class PrintArrayVariable {

	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println(array);
		array = null;
		System.out.println(array);
	}

}
