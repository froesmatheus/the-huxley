import java.util.Arrays;
import java.util.Scanner;

public class Intermediario3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int array[] = {a,b,c};
		Arrays.sort(array);
		System.out.println(array[1]);
		input.close();
	}
}
