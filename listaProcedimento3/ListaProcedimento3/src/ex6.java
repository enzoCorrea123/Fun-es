import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número do mês:");
		int numero = sc.nextInt();

		System.out.println(mes(numero));

	}

	static String mes(int numero) {
		switch (numero) {
		case 1:
			return "Janeiro";
		case 2:
			return "Fevereiro";
		case 3:
			return "Março";
		case 4:
			return "Abril";
		case 5:
			return "Maio";
		case 6:
			return "Junho";
		case 7:
			return "Julho";
		case 8:
			return "Agosto";
		case 9:
			return "Setembro";
		case 10:
			return "Outubro";
		case 11:
			return "Novembro";
		case 12:
			return "Dezembro";
		}
		return null;

	}

}
