import java.util.Scanner;

public class Triangulos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if ((a < (b+c)) && (b < (a+c)) && (c < (b+a))) {
			if (a < 90 && b < 90 && c < 90) {
				System.out.println("a");
			} else if (a == 90 || b == 90 || c == 90) {
				System.out.println("r");
			} else if (a > 90 || b > 90 || c > 90) {
				System.out.println("o");
			}
		} else {
			System.out.println("n");
		}
		input.close();
	}
}
