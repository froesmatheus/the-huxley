import java.util.Scanner;

public class ExcessoDeBagagem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double peso = input.nextDouble();
		double valorExcesso = 0.0;
		input.close();
		double adicional = peso - 20;
		if (peso <= 20) {
			valorExcesso = 0.0;
		} else if (peso >= 21 && peso <= 25) {
			valorExcesso = adicional * 12.50;
		} else if (peso >= 26 && peso <= 30) {
			valorExcesso = adicional * 32.75;
		} else {
			System.out.println("PESO LIMITE EXCEDIDO");
			return;
		}
		System.out.printf("%.2f", valorExcesso);
	}
}
