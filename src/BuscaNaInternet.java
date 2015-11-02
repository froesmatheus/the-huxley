import java.util.Scanner;

public class BuscaNaInternet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n >= 1 && n <= 1000) {
			int segundoLink = n * 2;
			int primeiroLink = segundoLink * 2;
			System.out.println(primeiroLink);
		}
		input.close();
	}
}
