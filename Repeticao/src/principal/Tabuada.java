package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		char operador;
		int resultado = 0;
		
		System.out.println("Digite um n�mero:");
		numero = leia.nextInt();
		
		while(numero > 10 || numero < 0) {
			System.out.println("O n�mero n�o pode ser maior que 10 e menor que 0.");
			System.out.println("Digite um n�mero:");
			numero = leia.nextInt();
		}
		System.out.println("Digite seu operador (+, -, /, *):");
		operador = leia.next().charAt(0);
		
		
		while(operador != '+' && operador != '-' && operador != '/' && operador != '*' ) {
			System.out.println("Op��o inv�lida!");
			System.out.println("Digite seu operador (+, -, /, *):");
			operador = leia.next().charAt(0);
		}
		for(int contador = 0; contador <=10; contador++ ) {
			if(operador == '+') {
				resultado = numero + contador;
				System.out.println("Tabuada:" + numero + operador + contador + "=" + resultado) ;
			}
			if(operador == '-') {
				resultado = numero - contador;
				System.out.println("Tabuada:" + numero + operador + contador + "=" + resultado) ;
			}
			if(operador == '*') {
				resultado = numero * contador;
				System.out.println("Tabuada:" + numero + operador + contador + "=" + resultado) ;
			}
			if(operador == '/') {
				resultado = numero / contador;
				System.out.println("Tabuada:" + numero + operador + contador + "=" + resultado) ;
			}
			
		
		
		leia.close();

	}

	}
}
