import java.util.Scanner;

public class Frigorifico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int identificadores[] = new int[n];
		double pesos[] = new double[n];
		int idGordo = 0, idMagro = 0;
		double pesoGordo = 0, pesoMagro = 100000;
		for (int i = 0; i < n; i++) {
			identificadores[i] = input.nextInt();
			pesos[i] = input.nextDouble();
			
			if (pesos[i] < pesoMagro) {
				pesoMagro = pesos[i];
				idMagro = identificadores[i];
			} 
			if (pesos[i] > pesoGordo) {
				pesoGordo = pesos[i];
				idGordo = identificadores[i];
			}
		}
		System.out.print("Gordo: id: " + idGordo);
		System.out.printf(" peso: %.2f", pesoGordo);
		System.out.print("Kg");
		System.out.print("\nMagro: id: " + idMagro);
		System.out.printf(" peso: %.2f", pesoMagro);
		System.out.print("Kg");
		input.close();
	}
}
