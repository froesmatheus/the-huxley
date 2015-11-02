import java.util.Scanner;

public class SomaDosMultiplos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int soma = 0;
		for (int i = n - 1; i > 0; i--) {
			if (i % 3 == 0) {
				soma += i;
			} else if (i % 5 == 0)
				soma += i;
		}
		System.out.println(soma);
		input.close();
	}
}
