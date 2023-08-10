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
				System.out.println("T�buada:" + numero + operador + contador + "=" + resultado) ;
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

/*	switch (operador) {
 		case '+':
			for(int contador = 1; contador<=10; contador++){
				System.out.println("Tabuada:" + numero + " + " + contador + "=" + resultado) ;
	 	break;
	 	case '-':
	 	int aux = numero;
	 		for(int contador = 1; contador<=10; contador++){
				System.out.println((aux +contador) + " - " + numero + "=" + ((aux + contador)- numero));
		break;
		case '*':
			for(int contador = 1; contador<=10; contador++){
				System.out.println("Tabuada:" + numero + " * " + contador + "=" + resultado) ;
		break;
		case '/":
			for(int contador = 1; contador<=10; contador++){
				System.out.println("Tabuada:" + (numero * contador) + " / " + numero + "=" + (numero * contador/ numero);
	 	break;

		default:
		System.out.println("Opera��o inv�lida");
		break;'
	}*/
