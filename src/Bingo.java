import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("O numero sorteado foi: " + x);
		input.close();
	}
}
