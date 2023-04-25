package listaFuncoes;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um caractere:");
		char caractere = sc.next().charAt(0);

		if (verificarDigito(caractere)) {
			System.out.println("É um dígito");
		} else {
			System.out.println("Não é um dígito");
		}

	}

	static boolean verificarDigito(char caractere) {
		char[] digito = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		int cont = 0;
		for (int contador = 0; contador < digito.length; contador++) {
			if (caractere == digito[contador]) {
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
