import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(bissexto(numero)) {
			System.out.println("É bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
		

	}

	static boolean bissexto(int numero) {
		if (numero % 4 == 0 && numero % 100 != 0 || numero % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
