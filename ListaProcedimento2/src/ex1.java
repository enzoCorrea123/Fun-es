import java.util.Random;
import java.util.Scanner;

public class ex1 {
	static Random random = new Random(1001);
	static int numRandom = random.nextInt();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Será sorteado um número de 1 a 1000, digite um palpite:");
		int palpite = sc.nextInt();
		while(palpite == numRandom) {
			
		}
		

	}

}
