import java.util.Scanner;

public class Idades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double somaIdades = 0.0;
		int contador = 0;
		while (n >= 0) {
			somaIdades += n;
			contador++;
			n = input.nextInt();
		}
		if (contador > 0)
			somaIdades /= contador;
		System.out.printf("%.2f", somaIdades);
		input.close();
	}
}
