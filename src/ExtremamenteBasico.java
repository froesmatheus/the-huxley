import java.util.Scanner;

public class ExtremamenteBasico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("X = " + (a + b));
		input.close();
	}
}
