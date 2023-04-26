package listaFuncoes;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um caractere:");
		String caractere = sc.next();
		if (caractere.length() != 1) {
			System.out.println("Caractere inválido");
			System.exit(0);
		}
		System.out.println(verificarCaractere(caractere));

	}

	static String verificarCaractere(String caractere) {
		return caractere.toLowerCase();

	}

}
