import java.util.Scanner;

public class FeriasNaEuropa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double porDia = 20 * 3.20;
		System.out.printf("%.2f", (porDia * n));
		input.close();
	}
}
