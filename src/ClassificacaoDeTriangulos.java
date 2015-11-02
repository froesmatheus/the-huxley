import java.util.Scanner;

public class ClassificacaoDeTriangulos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double l1 = input.nextDouble();
		double l2 = input.nextDouble();
		double l3 = input.nextDouble();
		if (l1 == l2 && l2 == l3) {
			System.out.println("equilatero");
		} else if (l1 != l2 && l2 != l3 && l3 != l1) {
			System.out.println("escaleno");
		} else if (l1 == l2 && l2 != l3 || l1 == l3 && l3 != l2 || l2 == l3 && l3 != l1){
			System.out.println("isosceles");
		}
		input.close();
	}
}
