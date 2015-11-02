import java.util.Scanner;

public class PropriedadeDo3025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n >= 1000 && n <= 9999) {
			int primeiraParte = n / 100;
			int segundaParte = n % 100;
			int d1 = primeiraParte + segundaParte;
			boolean booleano = Math.pow(d1, 2) == n;
			if (booleano) {
				System.out.println("propriedade do 3025!");
			} else {
				System.out.println("numero comum");
			}
			n = input.nextInt();
		}
		input.close();
	}
}
