import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu gênero: (M ou F)");
		char sexo = sc.next().charAt(0);
		System.out.println("Digite sua altura");
		double altura = sc.nextDouble();

		System.out.println(peso(sexo, altura));

	}

	static double peso(char sexo, double altura) {
		if (sexo == 'M') {
			return (72.7 * altura) - 58;
		} else if (sexo == 'F') {
			return (62.1 * altura) - 44.7;
		} else {
			return 0;
		}
	}

}
