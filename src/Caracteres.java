import java.util.Scanner;

public class Caracteres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int contador = 0;
		String palavrasInvertidas[] = new String[100000];
		while (n != 0 && n <= 100000) {
			String palavra = input.next();
			StringBuilder p = new StringBuilder(palavra).reverse();
			palavrasInvertidas[contador] = p.toString();
			contador++;
			n = input.nextInt();
		}
		for (int i = 0; i < palavrasInvertidas.length; i++) {
			if (palavrasInvertidas[i] != null) {
				System.out.println(palavrasInvertidas[i]);
			}
		}
		input.close();
	}
}
