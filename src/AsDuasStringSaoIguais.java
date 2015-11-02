import java.util.Scanner;

public class AsDuasStringSaoIguais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string1 = input.next();
		String string2 = input.next();
		if (string1.equals(string2)) {
			System.out.println("IGUAIS");
		} else {
			System.out.println("DIFERENTES");
		}
		input.close();
	}
}
