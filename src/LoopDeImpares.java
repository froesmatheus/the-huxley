import java.util.Scanner;

public class LoopDeImpares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		for (; n <= m; n++) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
		input.close();
	}
}
