import java.util.Scanner;

public class ex1 {
	static double real;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor em real");
		real = sc.nextDouble();

		System.out.println("Deseja converter para dólar ou para yene?\n 1 - dólar 2 - yene\n");
		int moeda = sc.nextInt();

		if (moeda == 1) {
			conversorDolar();
			System.out.println("O valor convertido para dólar é: US$ "+real);
		} else if (moeda == 2) {
			conversorYene();
			System.out.println("O valor convertido para yene é: ¥ "+real);
		} else {
			System.out.println("Número inválido");
		}

	}

	static void conversorDolar() {
		real = real * 0.3;

	}

	static void conversorYene() {
		real = real * 30;
	}


}
