import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		double volume = (4 * 3.14159 * Math.pow(r, 3)) / 3;
		System.out.printf("VOLUME = %.3f", volume);
		input.close();
	}
}
