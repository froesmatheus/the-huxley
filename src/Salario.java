import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroFuncionario = input.nextInt();
		int numeroHoras = input.nextInt();
		double valorHora = input.nextDouble();
		
		double salario = numeroHoras * valorHora;
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = R$ %.2f", salario);
		input.close();
	}
}
