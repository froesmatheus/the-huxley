import java.util.Scanner;

public class Eleitor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();
		if (idade < 16) {
			System.out.println("nao eleitor");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("eleitor obrigatorio");
		} else {
			System.out.println("eleitor facultativo");
		}
		input.close();
	}
}
