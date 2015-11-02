import java.util.Scanner;

public class ComaBem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float conta = input.nextFloat();
		float garcom = conta * 0.10f;
		conta += garcom;
		System.out.printf("%.2f", conta);
		input.close();
	}
}
