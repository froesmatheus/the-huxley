import java.util.Scanner;

public class BibliotecaRioTinto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dias = input.nextInt();
		System.out.printf("%.2f", (dias * 0.75));
		input.close();
	}
}
