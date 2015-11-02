import java.util.Arrays;
import java.util.Scanner;

public class FotoDeFamilia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[4];
		double menorAltura = 100;
		double segundaMenorAltura = 100;
		double terceiraMenorAltura = 100;
		double maiorAltura = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
//			if (array[i] < menorAltura) {
//				terceiraMenorAltura = segundaMenorAltura;
//				segundaMenorAltura = menorAltura;
//				menorAltura = array[i];
//			} else if (array[i] < segundaMenorAltura) {
//				terceiraMenorAltura = segundaMenorAltura;
//				segundaMenorAltura = array[i];
//			} else if (array[i] < terceiraMenorAltura) {
//				terceiraMenorAltura = array[i];
//			}
//			if (array[i] > maiorAltura)
//				maiorAltura = array[i];
//				array[2] = maiorAltura;
		}
		Arrays.sort(array);
		menorAltura = array[0];
		maiorAltura = array[3];
		segundaMenorAltura = array[1];
		terceiraMenorAltura = array[2];
		array[0] = menorAltura;
		array[1] = terceiraMenorAltura;
		array[2] = maiorAltura;
		array[3] = segundaMenorAltura;
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.2f", array[i]);
			System.out.println();
		}
		input.close();
	}
}
