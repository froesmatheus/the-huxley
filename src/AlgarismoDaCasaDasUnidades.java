import java.util.Scanner;

public class AlgarismoDaCasaDasUnidades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int algarismo = n % 10;
		System.out.println(algarismo);
		input.close();
	}
}
