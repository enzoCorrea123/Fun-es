import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();

		System.out.println(fatorial(numero));

	}

	static int fatorial(int numero) {
		int fatorial = 1;

		for (int contador = numero; contador >= 1; contador--) {
			fatorial *= contador;
		}

		return fatorial;

	}

}
