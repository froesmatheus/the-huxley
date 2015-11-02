import java.util.Scanner;

public class RestauranteDoVladimir {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String produto = input.next();
		String sabor = input.next();
		int quantidade = input.nextInt();
		double valorPago = 0.0;
		if (produto.equalsIgnoreCase("Pizza")) {
			if (sabor.equalsIgnoreCase("Calabresa")
					|| sabor.equalsIgnoreCase("Marguerita")) {
				valorPago = quantidade * 22.60;
			} else {
				valorPago = quantidade * 32.90;
			}
		} else if (produto.equalsIgnoreCase("Lasanha")) {
			if (sabor.equalsIgnoreCase("Queijo")) {
				valorPago = quantidade * 20.00;
			} else if (sabor.equalsIgnoreCase("Bolonhesa")) {
				valorPago = quantidade * 25.00;
			}
		}
		System.out.printf("%.2f", valorPago);
		input.close();
	}
}
