package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * uma estrutura de repeti��o
		 * repete determinado bloco de codigos enquanto
		 * uma condi�ao for satisfeita
		 */
		for(int contador = 0;contador<10; contador++) {
			System.out.println("Contador est� valendo: " + contador);
		}
		/* While = enquanto
		 * geralmente usado quando n�o sabemos a quantidade de
		 * vezes que ser� executado determinado comando
		 */
		int contador = 0;
		char opcao;
		
		System.out.println("deseja entrar no loop s/n?");
		opcao = leia.next().charAt(0);
		
		while(opcao == 's'){
			System.out.println("Contador valendo: "+ contador);
			contador ++;
			System.out.println("Deseja continuar o loop s/n?");
			opcao = leia.next().charAt(0);
		}
		/* do while = fa�a enquanto
		 * executa pelo menos 1 vez,temos a garantia de que ser�
		 * executado ao menos uma vez
		 */
		
		do {
			System.out.println("contador valendo: " + contador);
			contador ++;
			System.out.println("Deseja continuar o loop s/n?");
			opcao = leia.next().charAt(0);
			
		}while(opcao == 's');
		leia.close();
	}

}
