import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		int codigoPeca1 = input.nextInt();
		int numeroPeca1 = input.nextInt();
		double valorUnitPeca1 = input.nextDouble();
		
		@SuppressWarnings("unused")
		int codigoPeca2 = input.nextInt();
		int numeroPeca2 = input.nextInt();
		double valorUnitPeca2 = input.nextDouble();
		
		
		double valorPago = (valorUnitPeca1 * numeroPeca1) + (valorUnitPeca2 * numeroPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPago);
		input.close();
	}
}
