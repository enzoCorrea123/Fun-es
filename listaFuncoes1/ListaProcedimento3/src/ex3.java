import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(parOuImpar(numero)) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
		

	}

	static boolean parOuImpar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
