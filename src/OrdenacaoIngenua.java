import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoIngenua {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();
		input.close();
	}
}
