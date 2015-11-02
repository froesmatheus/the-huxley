import java.util.Scanner;

public class SomaDosDigitos {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(somaDigitos(n));
		input.close();
	}
	
	public static int somaDigitos(int n) {
		String numero = String.valueOf(n);
		char array[] = numero.toCharArray();
		int a = 0;
		for (int i = 0; i < numero.length(); i++) {
			 a += Character.getNumericValue(array[i]);
		}
		return a;
	}
}
