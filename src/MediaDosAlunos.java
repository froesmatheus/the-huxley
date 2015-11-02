import java.util.Scanner;

public class MediaDosAlunos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float n1, n2, n3, media;
		n1 = input.nextFloat();
		n2 = input.nextFloat();
		n3 = input.nextFloat();
		media = (n1 + n2 + n3) / 3;
		if (media >= 7) {
			System.out.println("aprovado");
		} else if (media >= 3) {
			System.out.println("prova final");
		} else {
			System.out.println("reprovado");
		}
		input.close();
	}
}
