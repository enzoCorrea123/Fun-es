import java.util.Scanner;

public class ex2 {
	static int diaAtual = 19, mesAtual = 4, anoAtual = 2023, x, resultado;
	static String diaSemana;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número x de dias:");
		x = sc.nextInt();
		calcularData();

	}

	static void calcularData() {
		diaAtual = diaAtual + x;

		while (diaAtual > 30) {
			mesAtual++;
			diaAtual -= 30;

			if (mesAtual > 12) {
				anoAtual++;
				mesAtual -= 12;
			}
		}

		resultado = x % 7;

		switch (resultado) {
		case 0:
			diaSemana = "Quarta-feira";
			break;

		case 1:
			diaSemana = "Quinta-feira";
			break;

		case 2:
			diaSemana = "Sexta-feira";
			break;

		case 3:
			diaSemana = "Sábado";
			break;

		case 4:
			diaSemana = "Domingo";
			break;

		case 5:
			diaSemana = "Segunda-feira";
			break;

		case 6:
			diaSemana = "Terça-feira";
			break;

		}

		System.out.println("Daqui a " + x + " dias será dia " + diaAtual + "/" + mesAtual + "/" + anoAtual + " ("
				+ diaSemana + ")");

	}

}
