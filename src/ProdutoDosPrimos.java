import java.util.Scanner;

public class ProdutoDosPrimos {
	private static Scanner ler;

	public static void main(String[] args) {
		int array[] = new int[4];
		int produto = 1;
		int contador = 0;
		ler = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			contador = 0;
			array[i] = ler.nextInt();
			for (int divisor = 1; divisor <= array[i]; divisor++) {
				if (array[i] % divisor == 0) {
					contador++;
				}
			}

			if (contador == 2) {
				produto *= array[i];
			} else {
				System.out.println("SEM PRODUTO");
				return;
			}
		}
		ler.close();
		System.out.println(produto);
	}
}