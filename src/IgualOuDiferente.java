import java.util.Scanner;

public class IgualOuDiferente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		if (n1 == n2 && n2 == n3) {
			System.out.println(1);
		} else if (n1 != n2 && n2 != n3 && n1 != n3) {
			System.out.println(2);
		} else if (n1 == n2 && n2 != n3 || n3 == n1 && n1 != n2 || n2 == n3 && n3 != n1) {
			System.out.println(3);
		}
		input.close();
	}
}
