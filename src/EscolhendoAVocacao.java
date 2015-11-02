import java.util.Scanner;

public class EscolhendoAVocacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int forca = input.nextInt();
		int inteligencia = input.nextInt();
		int destreza = input.nextInt();
		int furtividade = input.nextInt();
		int peso = input.nextInt();
		if (forca > 5 && destreza > 5 && peso > 5) {
			System.out.println("Knight");
		} else if (forca < 5 && inteligencia > 5 && furtividade > 5 && peso < 5) {
			System.out.println("Mage");
		} else if (forca > 5 && inteligencia > 5 && destreza > 5 && furtividade > 5 && peso < 5) {
			System.out.println("Paladin");
		} else {
			System.out.println("Orc");
		}
		input.close();
	}
}
