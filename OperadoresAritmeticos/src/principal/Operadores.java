package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador "+" para soma
		 * operador "-" para subtra��o
		 * operador "*" para multiplica��o
		 * operador "/" para divis�o
		 * operador "%" para o resto da divis�o
		 */
		int numero1 = 10;
		int numero2 = 10;
		int soma =  numero1 + numero2;
		int divisao = numero1 / numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int restoDaDivisao = numero1 % numero2;
		int calculo  = (10 + 10) * 10 / 10;
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Somando 2 numeros: " + (numero1 + numero2));
		System.out.println("Resultado da divisao: " + divisao);
		System.out.println("Resultado da subtracao: " + subtracao);
		System.out.println("Resultado da multiplica��o: " + multiplicacao);
		System.out.println("Resultado do resto da Divis�o: " + restoDaDivisao);
		System.out.println("Calculo: " + calculo);
		
				
	}

}
