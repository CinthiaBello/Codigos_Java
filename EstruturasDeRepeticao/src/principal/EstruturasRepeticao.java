package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * uma estrutura de repetição
		 * repete determinado bloco de codigos enquanto
		 * uma condiçao for satisfeita
		 */
		for(int contador = 0;contador<10; contador++) {
			System.out.println("Contador está valendo: " + contador);
		}
		/* While = enquanto
		 * geralmente usado quando não sabemos a quantidade de
		 * vezes que será executado determinado comando
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
		/* do while = faça enquanto
		 * executa pelo menos 1 vez,temos a garantia de que será
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
