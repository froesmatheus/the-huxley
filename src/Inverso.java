import java.util.Scanner;

public class Inverso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + " ");
			}
		}
		input.close();
	}
}
