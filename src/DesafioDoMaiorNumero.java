import java.util.Scanner;

public class DesafioDoMaiorNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = 0;
		int n = input.nextInt();
		while (n != 0) {
			if (n > maiorNumero)
				maiorNumero = n;
			n = input.nextInt();
		}
		System.out.println(maiorNumero);
		input.close();
	}
}
