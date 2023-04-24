import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();

		System.out.println(fibonacci(numero));

	}

	static int fibonacci(int numero) {
		int fibonacci = 0;
		int anterior=0;
		int proximo=1;
		for (int contador = 1; contador < numero; contador++) {
			fibonacci = anterior + proximo;
			System.out.println(fibonacci);
			
			anterior = proximo;
			proximo = fibonacci;
		}
		return proximo;
	}

}
