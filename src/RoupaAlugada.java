import java.util.Scanner;

public class RoupaAlugada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tipoItem = input.nextLine();
		String descricao = input.nextLine();
		double valorPago = 0.0;
		if (tipoItem.equalsIgnoreCase("Terno")) {
			if (descricao.equalsIgnoreCase("Simples")) {
				valorPago = 120.40 - (120.40 * 0.07);
			} else if (descricao.equalsIgnoreCase("Completo")) {
				valorPago = 150.35 - (150.35 * 0.07);
			} else if (descricao.equalsIgnoreCase("Fraque")) {
				valorPago = 180.70 - (180.70 * 0.07);
			}
		} else if (tipoItem.equalsIgnoreCase("Acessorio")) {
			if (descricao.equalsIgnoreCase("Gravata")) {
				valorPago = 30.00;
			} else if (descricao.equalsIgnoreCase("Sapato")) {
				valorPago = 80.00;
			} else if (descricao.equalsIgnoreCase("Cinto")) {
				valorPago = 15.00;
			}
		}
		System.out.printf("%.2f", valorPago);
		input.close();
	}
}
