import java.util.Scanner;

public class IguaisAN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[101];
		int ultimoNumero = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (i == array.length - 1) {
				ultimoNumero = array[i];
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] == ultimoNumero) {
						System.out.println(j);
					}
				}
			}
		}
		input.close();
	}
}
