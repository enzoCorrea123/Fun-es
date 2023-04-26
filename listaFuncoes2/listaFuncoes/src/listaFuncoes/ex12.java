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
		String[] partes = nome.split(" ");
		String sobrenome = partes[partes.length - 1];
		return sobrenome;

	}

}
