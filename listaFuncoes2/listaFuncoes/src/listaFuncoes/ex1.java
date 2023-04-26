package listaFuncoes;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em fahrenheit:");
		double fah = sc.nextDouble();

		System.out.println(converter(fah));

	}

	static double converter(double fah) {
		return (fah - 32) / 1.8;

	}

}
