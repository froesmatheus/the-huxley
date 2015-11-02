import java.util.Scanner;

public class InveterDoisAlgarismos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a, b;
		a = n % 10;
		b = n / 10;
		if (a == 0) {
			System.out.println(b);
		} else {
			System.out.println(a + "" + b);
		}
		input.close();
	}
}
