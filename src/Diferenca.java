import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		System.out.println("DIFERENCA = " + ((a * b) - (c * d)));
		input.close();
	}
}
