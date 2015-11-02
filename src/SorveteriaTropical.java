import java.util.Scanner;

public class SorveteriaTropical {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sabor = input.nextLine();
		int quantidade = input.nextInt();
		double valorPago = 0.0;
		if (sabor.equalsIgnoreCase("Morango") || sabor.equalsIgnoreCase("Cereja")) {
			valorPago = quantidade * 4.50;
		} else if (sabor.equalsIgnoreCase("Damasco") || sabor.equalsIgnoreCase("Siriguela")) {
			valorPago = quantidade * 3.80;
		} else {
			valorPago = quantidade * 2.75;
		}
		System.out.printf("%.2f", valorPago);
		System.out.println();
		System.out.println(quantidade > 2? "COM CALDA":"SEM CALDA");
		input.close();
	}
}
