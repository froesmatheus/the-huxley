import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Media3Inteiros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		double media = (n1 + n2 + n3) / 3;
		NumberFormat formatter = new DecimalFormat("###.#####");  
		String f = formatter.format(media);  
		System.out.println(f);
		input.close();
	}
}
