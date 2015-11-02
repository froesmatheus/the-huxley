import java.util.Scanner;

public class EUmNumeroPrimo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int contador = 0;
		while (n != -1) {
			contador = 0;
			for (int divisor = 1; divisor <= n; divisor++) {
				if (n % divisor == 0) {
					contador++;
				}
			}
			
			if (contador == 2) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			n = input.nextInt();
		}
		input.close();
	}
}
