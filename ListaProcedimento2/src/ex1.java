import java.util.Random;
import java.util.Scanner;

public class ex1 {
	static Random random = new Random();
	static int numRandom = random.nextInt(1001);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(numRandom);
		System.out.println("Será sorteado um número de 1 a 1000, digite um palpite:");
		int palpite = sc.nextInt();
		tentativas(palpite);

	}

	static void tentativas(int palpite) {

		int contTentativas = 0;
		while (palpite != numRandom) {
			contTentativas++;
			if (palpite < numRandom) {
				System.out.println("É maior");
			} else {
				System.out.println("É menor");
			}
			System.out.println("Será sorteado um número de 1 a 1000, digite um palpite:");
			palpite = sc.nextInt();
		}
		System.out.println("Você acertou!!\nNúmero de tentativas: " + contTentativas);
	}

}
