import java.util.Arrays;
import java.util.Scanner;

public class FestaDaMarilda {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String totalConvidados[] = new String[300];
		int contador = 0;
		String vetor[];
		int contVet = 0;
		while (n != 0) {
			vetor = new String[n];
			String convidados[] = new String[n];
			input.nextLine();
			for (int i = 0; i < convidados.length; i++) {
				convidados[i] = input.nextLine();
				
				vetor[contVet] = convidados[i];
				contVet++;
				
			}
			Arrays.sort(vetor);
			for (int i = 0; i < contVet; i++) {
				totalConvidados[contador] = vetor[i];
				contador++;
			}
			contVet = 0;
			n = input.nextInt();
		}
		String vetorSemNull[] = new String[contador];
		int contadorVetor = 0;
		for (int i = 0; i < contador; i++) {
			if (totalConvidados[i] != null) {
				vetorSemNull[contadorVetor] = totalConvidados[i];
				contadorVetor++;
			}
		}
		for (int i = 0; i < vetorSemNull.length; i++) {
			System.out.println(vetorSemNull[i]);
		}
		input.close();
	}
}
