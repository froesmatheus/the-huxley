import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float fahrenheit, celsius;
		fahrenheit = input.nextFloat();
		celsius = (fahrenheit - 32) / 1.8000f;
		System.out.printf("%.2f", celsius);
		input.close();
	}
}
