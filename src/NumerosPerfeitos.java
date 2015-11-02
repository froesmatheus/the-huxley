import java.util.Scanner;

public class NumerosPerfeitos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i < n; i++) {
			int soma = 0;
			for (int divisor = 1; divisor <= i; divisor++) {
				if (i % divisor == 0) {
					soma += divisor;
				}
			}
			
			if (soma == (i*2)) {
				System.out.println(i);
			}
		}
		input.close();
	}
}
