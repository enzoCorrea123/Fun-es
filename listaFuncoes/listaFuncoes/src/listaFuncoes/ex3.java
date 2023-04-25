package listaFuncoes;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a base:");
		int base = sc.nextInt();

		System.out.println("Digite o expoente:");
		int expoente = sc.nextInt();
		System.out.println(potencia(base, expoente));
	}

	 static int potencia(int base, int expoente) {
		 int resultado=1;
			for (int contador = 0; contador < expoente; contador++) {
				resultado = resultado * base;
			}
			return resultado;
	}
}
