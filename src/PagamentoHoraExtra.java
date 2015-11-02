import java.util.Scanner;

public class PagamentoHoraExtra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		int horasTrabalhadas = input.nextInt();
		double s1 = salario * 0.05;
		double valorPago = horasTrabalhadas * s1;
		System.out.printf("%.2f", (valorPago + salario));
		input.close();
	}
}
