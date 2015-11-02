import java.util.Scanner;

public class DivisivelPor3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int contador = 0;
		int divisor = 0;
		for (; divisor <= n; divisor = divisor + 3) {
			if (divisor != 0) {
				if (n % divisor == 0) {
					contador++;
				}
			}
		}
		if (contador == 0) {
			System.out.println("O numero nao possui divisores multiplos de 3!");
		} else {
			System.out.println(contador);
		}
		input.close();

	}

}
