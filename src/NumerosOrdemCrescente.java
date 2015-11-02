import java.util.Arrays;
import java.util.Scanner;

public class NumerosOrdemCrescente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		int array[] = {n1, n2, n3};
		Arrays.sort(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		input.close();
	}
}
