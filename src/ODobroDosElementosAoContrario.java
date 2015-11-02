import java.util.Scanner;

public class ODobroDosElementosAoContrario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i] * 2);
		}
		input.close();
	}
}
