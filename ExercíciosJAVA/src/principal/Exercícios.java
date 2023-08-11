// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
package principal;

import java.util.Scanner;

public class Exercícios {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String time1 = "";
		String time2 = "";
		int golsTime1 = 0;
		int golsTime2 = 0;
		
		
		
		System.out.println("Digite o nome do primeiro time: ");
		time1 = leia.next();
		System.out.println("Digite o nome do primeiro time: ");
		time2 = leia.next();
		System.out.println("Digite o número de gols do primeiro time: ");
		golsTime1 = leia.nextInt();
		System.out.println("Digite o número de gols do segundo time: ");
		golsTime2 = leia.nextInt();
		
		
		if(golsTime1 == golsTime2){
			System.out.println("Empate!");
		}
		if(golsTime1 > golsTime2) { 
			System.out.println(time1 + " é o vencedor!");
		}
		if(golsTime1 < golsTime2){
			System.out.println(time2 + " é o vencedor");
		}
		leia.close();
	}

}
