import java.util.Scanner;

public class AntecessorESucessor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println((n - 1) + " " + (n + 1));
		input.close();
	}
}
