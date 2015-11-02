import java.util.Scanner;

public class SubstituicaoDeCaracteresEmUmaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		char char1 = input.nextLine().charAt(0);
		char char2 = input.nextLine().charAt(0);
		string = string.replace(char1, char2);
		System.out.println(string);
		input.close();
	}
}
