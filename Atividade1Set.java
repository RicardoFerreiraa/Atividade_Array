package atividadearrays;

import java.util.*;

public class Atividade1Set {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		int NumerosDigitados;

		System.out.println("Digite 10 valores inteiros não repetidos: ");
		NumerosDigitados = sc.nextInt();

		while(setNumeros.size() < 9) {
			NumerosDigitados =sc.nextInt();

			if(!setNumeros.contains(NumerosDigitados)) {
				setNumeros.add(NumerosDigitados);

			}else {
				System.out.println("O numero "+ NumerosDigitados +" já foi adicionado. Digite outro: ");
			}
		}
		System.out.println("\n Listar dados do Set: ");

		Iterator<Integer> isetNumeros = setNumeros.iterator();

		while(isetNumeros.hasNext()){
			System.out.println(isetNumeros.next());			
		}
		sc.close();
	}
}
