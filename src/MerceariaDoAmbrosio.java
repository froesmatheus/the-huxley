import java.util.Scanner;

public class MerceariaDoAmbrosio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int codigoProduto = input.nextInt();
		int quantidadeComprada = input.nextInt();
		double valor = 0.0;
		switch (codigoProduto) {

		case 1:
			valor = quantidadeComprada * 5.30;
			break;
		case 2:
			valor = quantidadeComprada * 6.00;
			break;
		case 3:
			valor = quantidadeComprada * 3.20;
			break;
		case 4:
			valor = quantidadeComprada * 2.50;
			break;
		}

		if (quantidadeComprada >= 15 || valor >= 40) {
			valor = valor - (valor * 0.15);
		}
		
		System.out.printf("R$ %.2f", valor);
		input.close();
	}
}
