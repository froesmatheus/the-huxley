import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeCinco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int i = 0;
		ArrayList<Integer> array = new ArrayList<>();
		for (; n <= m; n++) {
			if (n % 5 == 0) {
				i++;
				array.add(n);
			}
		}
		for (int j = 0; j < i; j++) {
			if (j < i - 1) {
				System.out.print(array.get(j) + "|");
			} else {
				System.out.println(array.get(j));
			}
		}
		input.close();
	}
}
