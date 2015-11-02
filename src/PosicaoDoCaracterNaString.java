import java.util.Scanner;

public class PosicaoDoCaracterNaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		char caracter = input.nextLine().charAt(0);
		System.out.println(palavra.indexOf(caracter));
		input.close();
	}
}
