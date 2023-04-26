package listaFuncoes;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String palavra = sc.next();
		System.out.println(verificarMaiuscula(palavra));

	}

	static boolean verificarMaiuscula(String palavra) {
		boolean maiuscula = false;
		for (int contador = 0; contador < palavra.length(); contador++) {
			if (palavra.charAt(contador) == palavra.toUpperCase().charAt(contador)) {
				maiuscula = true;
			} else {
				maiuscula = false;
			}
		}

		return maiuscula;
	}

}
