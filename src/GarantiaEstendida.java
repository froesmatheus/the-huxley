import java.util.Scanner;

public class GarantiaEstendida {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valorProduto = input.nextDouble();
		int anosGarantia = input.nextInt();
		double valorPago = 0.0;
		if (anosGarantia > 0) {
			if (anosGarantia == 1) {
				valorPago = (valorProduto * 0.03) + valorProduto;
			} else if (anosGarantia == 2) {
				valorPago = (valorProduto * 0.05) + valorProduto;
			}
		} else {
			valorPago = valorProduto;
		}
		System.out.printf("%.2f", valorPago);
		input.close();
	}
}
