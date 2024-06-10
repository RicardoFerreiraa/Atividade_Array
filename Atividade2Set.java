package atividadearrays;

import java.util.*;

public class Atividade2Set {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		Set<Integer> setValores = new HashSet<Integer>();
		int NumDigitado;

		Integer y= Integer.valueOf(10);

		setValores.add(y);
		setValores.add(2);
		setValores.add(5);
		setValores.add(1);
		setValores.add(3);
		setValores.add(4);
		setValores.add(9);
		setValores.add(7);
		setValores.add(8);

		for(int i = 1; i <= 10; i++) {
			setValores.add(i);
		}
		System.out.println("Digite o número que você deseja encontrar: ");
		NumDigitado = sc.nextInt();

		if(setValores.contains(NumDigitado)) {
			System.out.println("O número " + NumDigitado + " foi encontrado");	

		}else {
			System.out.println("o número " + NumDigitado + " não foi encontrado!");

		}
		sc.close();
	}
}
