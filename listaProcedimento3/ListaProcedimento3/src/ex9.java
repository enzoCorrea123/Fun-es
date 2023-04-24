import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu gênero: (M ou F)");
		char sexo = sc.next().charAt(0);
		System.out.println("Digite seu peso");
		double peso = sc.nextDouble();
		System.out.println("Digite sua altura");
		double altura = sc.nextDouble();
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();

		System.out.println(geb(sexo, peso, altura, idade));

	}

	static double geb(char sexo, double peso, double altura, int idade) {
		if (sexo == 'M') {
			return 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);
		} else if (sexo == 'F') {
			return 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);
		}else {
			return 0;
		}
	}

}
