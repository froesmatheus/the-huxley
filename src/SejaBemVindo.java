import java.util.Scanner;

public class SejaBemVindo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		nome = input.nextLine();
		System.out.println("Seja muito bem-vindo " + nome);
		input.close();
	}
}
