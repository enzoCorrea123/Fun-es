package listaFuncoes;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um caractere:");
		char caractere = sc.next().charAt(0);

		if (verificarAlfabeto(caractere)) {
			System.out.println("É um caractere maiúsculo");
		} else {
			System.out.println("Não é um caractere maiúsculo");
		}

	}

	static boolean verificarAlfabeto(char caractere) {
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int cont = 0;
		for (int contador = 0; contador < alfabeto.length; contador++) {
			if (caractere == (alfabeto[contador])) {
				cont++;
			}
		}
		if (cont == 0) {
			return false;
		} else {
			return true;
		}

	}

}
