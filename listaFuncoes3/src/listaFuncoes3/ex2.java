package listaFuncoes3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String palavra1 = sc.next();
		System.out.println("Digite outra palavra:");
		String palavra2 = sc.next();
		System.out.println(verificarCadeias(palavra1,palavra2));

	}

	 static boolean verificarCadeias(String palavra1, String palavra2) {
		boolean iguais = false;
		for (int contador = 0; contador < palavra1.length(); contador++) {
			if(palavra1.charAt(contador) == palavra2.charAt(contador)) {
				iguais = true;
			}else {
				iguais = false;
				break;
			}
			
		}
		
		
		return iguais;
	}

}
