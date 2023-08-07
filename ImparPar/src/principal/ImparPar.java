package principal;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int numero = 5;
		
		if (numero % 2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número impar");
		}
		leia.close();
		

	}

}
