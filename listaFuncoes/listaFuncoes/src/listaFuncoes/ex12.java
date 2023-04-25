package listaFuncoes;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome completo:");
		String nome = sc.nextLine();
		System.out.println(verificarSobrenome(nome));

	}

	static String verificarSobrenome(String nome) {
		for (int contador = 0; contador < nome.length(); contador++) {
			if (nome.charAt(contador) == ' ') {
				int contadorEspaco = nome.charAt(contador);
				for (int contador2 = 0; contador2 < contadorEspaco; contador2++) {//arrumar aqui
					nome.replace(nome.charAt(contador2), ' ');
				}
			}
		}
		return nome;

	}

}
