import java.util.ArrayList;
import java.util.Scanner;

public class Fatorial {
	public static int fat(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * fat(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		while (n != -1) {
			array.add(fat(n));
			n = input.nextInt();
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		input.close();
	}
}
