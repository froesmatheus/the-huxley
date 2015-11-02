import java.util.Scanner;

public class ConceitoMEC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtLivros = input.nextInt();
		int qtAlunos = input.nextInt();
		if ((qtAlunos / qtLivros) <= 8) {
			System.out.println("A");
		} else if ((qtAlunos / qtLivros <= 12)) {
			System.out.println("B");
		} else if ((qtAlunos / qtLivros) <= 18) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		input.close();
	}
}
