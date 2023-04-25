package listaFuncoes;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um frase:");
		String frase = sc.nextLine();
		System.out.println(fraseMinuscula(frase));

	}

	static String fraseMinuscula(String frase) {
		return frase.toLowerCase();

	}

}
