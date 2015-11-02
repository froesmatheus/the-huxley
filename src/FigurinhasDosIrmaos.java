import java.util.Scanner;

public class FigurinhasDosIrmaos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int somaJoao = 0, somaMaria = 0;
		int array[] = new int[n];
		int contadorCartasJoao = 0, contadorCartasMaria = 0;
		int cartasJoao[] = new int[n];
		int cartasMaria[] = new int[n];
		int contadorJoao = 0, contadorMaria = 0;
		for (int i = 0; i < array.length; i++) {
			int contador = 0;
			array[i] = input.nextInt();
			if (array[i] % 2 == 0) {
				contadorCartasJoao++;
			} else {
				contadorCartasMaria++;
			}
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					contador++;
				}
			}
			if (contador == 0) {
				if (array[i] % 2 == 0) {
					cartasJoao[contadorJoao] = array[i];
					somaJoao += array[i];
					contadorJoao++;
				} else {
					cartasMaria[contadorMaria] = array[i];
					somaMaria += array[i];
					contadorMaria++;
				}
			}
		}
		System.out.println(contadorCartasJoao);
		System.out.println(contadorCartasMaria);
		if (somaJoao > somaMaria) {
			System.out.println(somaJoao);
		} else {
			System.out.println(somaMaria);
		}
		input.close();
	}
}
