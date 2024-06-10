package atividadearrays;

import java.util.*;
import java.util.Scanner;

public class Atividade1CollectionList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> Cores = new ArrayList<String>();

		for(int i=0; i < 5; i++) {
			System.out.println("Digite a " +(i+1) + " º Cor: ");
			String Cor = sc.nextLine();

			Cores.add(Cor);
		}

		System.out.println("\n--- Listar todas as Cores ---");
		for(String Cor : Cores) {
			System.out.println(Cor);
		}

		Collections.sort(Cores);

		System.out.println("\n--- Ordenar Cores ---");
		for(String Cor : Cores) {
			System.out.println(Cor);
		}
		sc.close();
	}


}
