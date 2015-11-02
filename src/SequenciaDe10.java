import java.util.Scanner;

public class SequenciaDe10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		int contador = 0;
		int ultimoNumero = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (i == 9) {
				ultimoNumero = array[i];
				for (int j = 0; j < array.length; j++) {
					if (array[j] == ultimoNumero) {
						contador++;
					}
				}
			}
		}
		System.out.println("O numero " + ultimoNumero + " apareceu " + contador + " vezes");
		input.close();
	}
}
