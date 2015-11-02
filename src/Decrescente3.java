import java.util.Arrays;
import java.util.Scanner;

public class Decrescente3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int array[] = {a,b,c};
		Arrays.sort(array);
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		input.close();
	}
}
