package atividadearrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2CollectionList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> Lista = new ArrayList<Integer>();
		int Numero;
		int Posicao;

		Lista.add(2);
		Lista.add(5);
		Lista.add(1);
		Lista.add(3);
		Lista.add(4);
		Lista.add(9);
		Lista.add(7);
		Lista.add(8);
		Lista.add(10);
		Lista.add(6);


		for(int i=0; i <Lista.size(); i++) {
			System.out.println(Lista.get(i));
		}

		System.out.println("Digite o Numero que deseja encontrar: ");
		Numero = sc.nextInt();

		if(Lista.contains(Numero)) {
			Posicao = Lista.indexOf(Numero);

			System.out.println("O número " + Numero + " está localizado na posição: " +Posicao );
		}else {
			System.out.println("O número "+ Numero + " não foi encontrado!");
		}
		sc.close();
	}

}
