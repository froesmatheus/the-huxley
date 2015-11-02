import java.util.Scanner;

public class InverterQuatroAlgarismos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		int n1 = numero % 10;
		if (n1 == 0) {
			n1 = -1;
		} else {
			System.out.print(n1);
		}
		int n2 = (numero / 10) % 10;
		if (n2 == 0) {
			n2 = -1;
		} else {
			System.out.print(n2);
		}
		int n3 = ((numero / 10) / 10) % 10;
		if (n3 == 0) {
			n3 = -1;
		} else {
			System.out.print(n3);
		}
		int n4 = (((numero / 10) / 10) / 10) % 10;
		if (n4 == 0) {
			n4 = -1;
		} else {
			System.out.print(n4);
		}
		input.close();
	}
}
