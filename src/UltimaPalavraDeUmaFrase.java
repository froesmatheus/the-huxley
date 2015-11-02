import java.util.Scanner;

public class UltimaPalavraDeUmaFrase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase = input.nextLine();
		int lastIndex = frase.lastIndexOf(" ");
		String ultimaPalavra = frase.substring(lastIndex + 1, frase.length());
		System.out.println(ultimaPalavra);
		input.close();
	}
}
