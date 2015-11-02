import java.util.Scanner;

public class TorneioDeFutsal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valorTotal = input.nextDouble();
		double vencedor = valorTotal * 0.60;
		double segundoColocado = valorTotal * 0.30;
		double terceiroColocado = valorTotal * 0.10;
		System.out.printf("%.2f", vencedor);
		System.out.printf("\n%.2f", segundoColocado);
		System.out.printf("\n%.2f", terceiroColocado);
		input.close();
	}
}
