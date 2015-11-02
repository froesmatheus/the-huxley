import java.util.Scanner;

public class ConcatenarPalavras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		String string2 = input.nextLine();
		System.out.println(string1+string2);
		input.close();
	}
}
