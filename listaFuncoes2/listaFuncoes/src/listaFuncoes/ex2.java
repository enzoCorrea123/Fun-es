package listaFuncoes;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();

		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		System.out.println(multiplicar(a, b));

	}

	static int multiplicar(int a, int b) {
		int resultado=0;
		for (int contador = 0; contador < b; contador++) {
			resultado = resultado + a;
		}
		return resultado;
	}

}
