import java.util.Scanner;

public class ODobroDosElementos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println((array[i] * 2));
		}
		input.close();
	}
}
