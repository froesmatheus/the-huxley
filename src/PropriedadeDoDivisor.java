import java.util.Scanner;

public class PropriedadeDoDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n / 10;
		if (n % 10 != 0 && n % temp == 0) {
			System.out.println("SIM");
		} else {
			System.out.println("NAO");
		}
		input.close();
	}
}
