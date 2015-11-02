import java.util.Scanner;

public class PropriedadeDoInvertido {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		for (;x <= y; x++) {
			if (x % 10 != 0) {
				int temp = x / 10;
				if (x % temp == 0) {
					System.out.println(x);
				}
			}
		}
		input.close();
	}
}
