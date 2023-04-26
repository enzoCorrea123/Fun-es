package listaFuncoes3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma cadeia:");
		String cadeia = sc.next();
		System.out.println(verificarCadeia(cadeia));

	}

	static int verificarCadeia(String cadeia) {
		int contadorNumeros = 0;
		int contadorLetras = 0;

		for (int contador = 0; contador < cadeia.length(); contador++) {
			if (!Character.isLetterOrDigit(cadeia.charAt(contador))) {
				return -1;
			}
			if (Character.isDigit(cadeia.charAt(contador))) {
				contadorNumeros++;
			}
			if (Character.isLetter(cadeia.charAt(contador))) {
				contadorLetras++;
			}
			
			
			
		}
		if (contadorNumeros < contadorLetras) {
			return 1;
		}

		return 0;
	}

}
