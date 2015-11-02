import java.util.Scanner;

public class NumerosNoMeioDaFrase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("O resultado da soma entre " + a + " e " + b + " = "
				+ (a + b));
		input.close();
	}
}
