import java.util.Scanner;

public class LimiteDeVelocidade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int velocidade = input.nextInt();
		System.out.printf("%.2f", calculaMulta(velocidade));
		input.close();
	}
	
	public static double calculaMulta(int velocidade) {
		double velocidadeMaxima = 50;
		double multa = 0.0;
		if (velocidade > velocidadeMaxima) {
			if (velocidade <= ((velocidadeMaxima * 0.10) + velocidadeMaxima)) {
				multa = 230.00;
			} else if (velocidade <= ((velocidadeMaxima * 0.20) + velocidadeMaxima)) {
				multa = 340.00;
			} else {
				multa = (velocidade - 50) * 19.28;
			}
		}
		return multa;
	}
}
