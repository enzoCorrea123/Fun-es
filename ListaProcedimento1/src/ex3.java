import java.util.Scanner;

public class ex3 {
	static int diaAtual = 19, mesAtual = 4, anoAtual = 2023, x, resultado,idioma;
	static String diaSemana;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número x de dias:");
		x = sc.nextInt();
		System.out.println("Digite o idioma que os dias da semana serão imprimidos:"
				+ "\n1 - Inglês\n2 - Espanhol\n3 - Francês\n4 - Alemão\n5 - Japonês\n6 - Russo\n7 - Português");
		idioma = sc.nextInt();
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
		
		switch(idioma) {
		case 7:
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
			break;
		case 6:
			switch (resultado) {
			case 0:
				diaSemana = "Среда";
				break;

			case 1:
				diaSemana = "Четверг";
				break;

			case 2:
				diaSemana = "Пятница";
				break;

			case 3:
				diaSemana = "Суббота";
				break;

			case 4:
				diaSemana = "Воскресенье";
				break;

			case 5:
				diaSemana = "Понедельник";
				break;

			case 6:
				diaSemana = "Вторник";
				break;

			}
			break;
		case 5: 
			switch (resultado) {
			case 0:
				diaSemana = "水曜日 - Suiyōbi ";
				break;

			case 1:
				diaSemana = "木曜日 - mokuyōbi ";
				break;

			case 2:
				diaSemana = "金曜日 - kin'yōbi ";
				break;

			case 3:
				diaSemana = "土曜日 - doyōbi ";
				break;

			case 4:
				diaSemana = "日曜日 - nichiyōbi ";
				break;

			case 5:
				diaSemana = "月曜日 - getsuyōbi ";
				break;

			case 6:
				diaSemana = "火曜日 - kayōbi";
				break;

			}
			break;
		case 4:
			switch (resultado) {
			case 0:
				diaSemana = "Mittwoch";
				break;

			case 1:
				diaSemana = "Donnerstag";
				break;

			case 2:
				diaSemana = "Freitag";
				break;

			case 3:
				diaSemana = "Samstag";
				break;

			case 4:
				diaSemana = "Sonntag";
				break;

			case 5:
				diaSemana = "Montag";
				break;

			case 6:
				diaSemana = "Dienstag";
				break;

			}
			break;
		case 3:
			switch (resultado) {
			case 0:
				diaSemana = "Mercredi";
				break;

			case 1:
				diaSemana = "Jeudi";
				break;

			case 2:
				diaSemana = "Vendredi";
				break;

			case 3:
				diaSemana = "Samedi";
				break;

			case 4:
				diaSemana = "Dimanche";
				break;

			case 5:
				diaSemana = "Lundi";
				break;

			case 6:
				diaSemana = "Mardi";
				break;

			}
			break;
		case 2:
			switch (resultado) {
			case 0:
				diaSemana = "Miércoles";
				break;

			case 1:
				diaSemana = "Jueves";
				break;

			case 2:
				diaSemana = "Viernes";
				break;

			case 3:
				diaSemana = "Sábado";
				break;

			case 4:
				diaSemana = "Domingo";
				break;

			case 5:
				diaSemana = "Lunes";
				break;

			case 6:
				diaSemana = "Martes";
				break;

			}
			break;
		case 1:
			switch (resultado) {
			case 0:
				diaSemana = "Wednesday";
				break;

			case 1:
				diaSemana = "Thursday";
				break;

			case 2:
				diaSemana = "Friday";
				break;

			case 3:
				diaSemana = "Saturday";
				break;

			case 4:
				diaSemana = "Sunday";
				break;

			case 5:
				diaSemana = "Monday";
				break;

			case 6:
				diaSemana = "Tuesday";
				break;

			}
			break;	
		}
		

		System.out.println("Daqui a " + x + " dias será dia " + diaAtual + "/" + mesAtual + "/" + anoAtual + " ("
				+ diaSemana + ")");

	}
}
