import java.util.Scanner;

public class TudoEmMaisculo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		System.out.println(palavra.toUpperCase());
		input.close();
	}
}
