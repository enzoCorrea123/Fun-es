package listaFuncoes;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um frase:");
		String frase = sc.nextLine();
		System.out.println(fraseMaiuscula(frase));

	}

	static String fraseMaiuscula(String frase) {
		return frase.toUpperCase();

	}

}
