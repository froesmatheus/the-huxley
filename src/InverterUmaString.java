import java.util.Scanner;

public class InverterUmaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		StringBuilder sb = new StringBuilder(string);
		System.out.println(sb.reverse());
		input.close();
	}
}
