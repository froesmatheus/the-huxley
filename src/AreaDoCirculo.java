import java.util.Scanner;

public class AreaDoCirculo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		r = r / 100;
		double area = 3.14159 * Math.pow(r, 2);
		System.out.printf("Area = %.4f", area);
		input.close();
	}
}
