import java.util.Scanner;

public class QuantosDigitosExistemNaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		int contador = 0;
		for (int i = 0; i < palavra.length(); i++) {
			String letra = palavra.substring(i, i+1);
			try {
				Integer.valueOf(letra);
				contador++;
			} catch (NumberFormatException e) {
				
			}
		}
		System.out.println(contador);
		input.close();
	}
}
