package listaFuncoes;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra sem espaços:");
		String palavra = sc.next();
		System.out.println(verificarPalindromo(palavra));

	}

	static boolean verificarPalindromo(String palavra) {
		int contReverso = 0;
		boolean palindromoBoolean = false;
		String palindromoString = "";
		for (int contador = palavra.length(); contador > 0; contador--) {
			palindromoString += palavra.charAt(contador - 1);
		}

		for (int contador = 0; contador < palavra.length(); contador++) {
			if (palavra.charAt(contador) == palindromoString.charAt(contador)) {
				palindromoBoolean = true;
			} else {
				palindromoBoolean = false;
			}
			contReverso++;
		}
		return palindromoBoolean;

	}

}
