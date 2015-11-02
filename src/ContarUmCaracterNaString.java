import java.util.Scanner;

public class ContarUmCaracterNaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		char caracter = input.next().charAt(0);
		palavra.indexOf(caracter);
		int contador = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == caracter) {
				contador++;
			}
		}
		System.out.println(contador);
		input.close();
	}
}
