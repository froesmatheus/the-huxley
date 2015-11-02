import java.util.Scanner;

public class SomaSequenciaNumeros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			soma += array[i];
		}
		System.out.println(soma);
		input.close();
	}
}
