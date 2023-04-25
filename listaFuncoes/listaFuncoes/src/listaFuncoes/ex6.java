package listaFuncoes;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um caractere:");
		char caractere = sc.next().charAt(0);

		if (verificarAlfabeto(caractere)) {
			System.out.println("É um caractere minúsculo");
		} else {
			System.out.println("Não é um caractere minúsculo");
		}

	}

	static boolean verificarAlfabeto(char caractere) {
		char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int cont = 0;
		for (int contador = 0; contador < alfabeto.length; contador++) {
			if (caractere == alfabeto[contador]) {
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
