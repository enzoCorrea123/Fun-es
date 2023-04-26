package listaFuncoes3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String palavra = sc.next();
		System.out.println(verificarMinuscula(palavra));

	}

	static boolean verificarMinuscula(String palavra) {
		boolean minuscula = false;
		for (int contador = 0; contador < palavra.length(); contador++) {
			if (palavra.charAt(contador) == palavra.toLowerCase().charAt(contador)) {
				minuscula = true;
			} else {
				minuscula = false;
				break;
			}
		}

		return minuscula;

	}

}
