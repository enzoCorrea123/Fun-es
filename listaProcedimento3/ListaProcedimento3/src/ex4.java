import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro número:");
		int numero2 = sc.nextInt();
		if(multiplo(numero1, numero2)) {
			System.out.println("É múltiplo");
		}else {
			System.out.println("Não é múltiplo");
		}
		

	}

	static boolean multiplo(int numero1, int numero2) {
		if (numero1 % numero2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
