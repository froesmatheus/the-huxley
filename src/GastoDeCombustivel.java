import java.util.Scanner;

public class GastoDeCombustivel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempoViagem = input.nextInt();
		int velocidadeMedia = input.nextInt();
		double distanciaPercorrida = tempoViagem * velocidadeMedia;
		double litrosNecessarios = (distanciaPercorrida / 12);
		System.out.printf("%.3f", litrosNecessarios);
		input.close();
	}
}
