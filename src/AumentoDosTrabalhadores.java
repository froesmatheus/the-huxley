import java.util.Scanner;

public class AumentoDosTrabalhadores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		double novoSalario = 0;
		if (salario > 500) {
			novoSalario = salario + (salario * 0.10);
		} else if (salario > 300) {
			novoSalario = salario + (salario * 0.07);
		} else {
			novoSalario = salario + (salario * 0.05);
		}
		System.out.printf("%.2f", novoSalario);
		input.close();
	}
}
