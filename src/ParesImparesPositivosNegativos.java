import java.util.Scanner;

public class ParesImparesPositivosNegativos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("POSITIVO PAR");
			} else {
				System.out.println("POSITIVO IMPAR");
			}
		} else if (n < 0) {
			if (n % 2 == 0) {
				System.out.println("NEGATIVO PAR");
			} else {
				System.out.println("NEGATIVO IMPAR");
			}
		} else {
			System.out.println("NULO");
		}
		System.out.println();
		input.close();
	}
}
