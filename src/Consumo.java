import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		double y = input.nextDouble();
		System.out.printf("%.3f", (x / y));
		System.out.print(" km/l");
		input.close();
	}
}
