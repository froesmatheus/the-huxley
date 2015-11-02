import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatriculasDuplas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();
		
		for (int i = 0; i < 45; i++) {
			lista.add(input.nextInt());
		}
		
		for (int i = 0; i < 30; i++) {
			lista2.add(input.nextInt());
		}
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista2.size(); j++) {
				if (lista2.contains(lista.get(j))) {
					lista3.add(lista.get(j));
				}
			}
		}
		
		for (Integer integer : lista3) {
			System.out.print(integer + " ");
		}
		System.out.println();
		input.close();
		
		
	}
}
