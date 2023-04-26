package listaFuncoes;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número binário:");
		String cadeia = sc.next();
		System.out.println(verificarBinario(cadeia));

	}

	static boolean verificarBinario(String cadeia) {
		boolean binario = false;
		for (int contador = 0; contador < cadeia.length(); contador++) {
			if (cadeia.charAt(contador) == '1' || cadeia.charAt(contador) == '0') {
				binario = true;
			}
			else {
				binario = false;
			}
		}

		return binario;
	}

}
