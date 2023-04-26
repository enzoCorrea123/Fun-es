import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = sc.nextInt();

		tabuada(numero);

	}

	static void tabuada(int numero) {
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
		}
	}

}
