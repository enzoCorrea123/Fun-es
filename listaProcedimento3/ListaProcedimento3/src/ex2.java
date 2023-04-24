import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();

		System.out.println(modulo(numero));

	}

	static int modulo(int numero) {
		return Math.abs(numero);

	}

}
