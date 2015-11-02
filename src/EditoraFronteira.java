import java.util.Scanner;

public class EditoraFronteira {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		int anos = input.nextInt();
		double valorPago = 0;
		if (string.equalsIgnoreCase("Mural")) {
			valorPago = anos * 200.00;
		} else if (string.equalsIgnoreCase("O Coreto")) {
			valorPago = anos * 235.00;
		} else if (string.equalsIgnoreCase("Meu Lar")) {
			valorPago = anos * 180.00;
			valorPago -= valorPago * 0.10;
		} else if (string.equalsIgnoreCase("Sua Mesa")) {
			valorPago = anos * 230.00;
			valorPago -= valorPago * 0.10;
		}
		System.out.printf("%.2f", valorPago);
		input.close();
	}
}
