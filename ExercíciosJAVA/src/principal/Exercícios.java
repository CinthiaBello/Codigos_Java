// Ler o nome de 2 times e o n�mero de gols marcados na partida (para cada time). Escrever o nome
// do vencedor. Caso n�o haja vencedor dever� ser impressa a palavra EMPATE.
package principal;

import java.util.Scanner;

public class Exerc�cios {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// variaveis que recebe os nomes dos times
		String time1 = "";
		String time2 = "";
		// variaveis que recebe a qntidade de gols
		int golsTime1 = 0;
		int golsTime2 = 0;
		
		
		//Pede para o usu�rio e l� o nome do time 1
		System.out.println("Digite o nome do primeiro time: ");
		time1 = leia.next();
		//Pede para o usu�rio e l� o nome do time 2
		System.out.println("Digite o nome do primeiro time: ");
		time2 = leia.next();
		//Pede para o usu�rio e l� a qntdade de gols do time 1
		System.out.println("Digite o n�mero de gols do primeiro time: ");
		golsTime1 = leia.nextInt();
		//Pede para o usu�rio e l� a qntdade de gols do time 2
		System.out.println("Digite o n�mero de gols do segundo time: ");
		golsTime2 = leia.nextInt();
		
		// verifica se deu empate
		if(golsTime1 == golsTime2){
			System.out.println("Empate!");
		}
		//verifica se o time1 � o vencedor
		if(golsTime1 > golsTime2) { 
			System.out.println(time1 + " � o vencedor!");
		}
		//verifica se o time 2 � o vencedor
		if(golsTime1 < golsTime2){
			System.out.println(time2 + " � o vencedor");
		}
		leia.close();
	}

}
