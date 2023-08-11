// Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
// at� 20 litros, desconto de 3% por litro �lcool
// acima de 20 litros, desconto de 5% por litro
// at� 20 litros, desconto de 4% por litro Gasolina
// acima de 20 litros, desconto de 6% por litro

// Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
// seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
// que o pre�o do litro da gasolina � R$ 5,80 e o pre�o do litro do �lcool � R$ 3,90. 
package principal;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//vari�vel para receber o n�mero de litros
		double nLitros = 0;
		//variavel para receber o caracter
		char combustivel; 
		//variavel para receber o total a pagar
		double aPagar = 0;
		
		//validar o caracter  
		do {//pedir para escolher o tipo de combustivel
			System.out.println("Digite qual o combust�vel: A-�lcool G-Gasolina");
			combustivel = leia.next().charAt(0);
		}
		while(Character.toUpperCase(combustivel) != 'A' && Character.toUpperCase(combustivel) != 'B');
		//validar o n�mero de litros
		do {//pedir a quantidade de litros
			System.out.println("Digite o n�mero de litros: ");
			nLitros = leia.nextDouble();
			
		}
		while(nLitros <=0);
		//Fazer o calculo do desconto com base na quantidade de litros que foi abastecido e o 
		//tipo de combustivel
		if (Character.toUpperCase(combustivel) == 'A') {
			if(nLitros <= 20) {
				aPagar = (nLitros * 3.90) - 0.03;
			}else {
				aPagar = (nLitros * 3.90) - 0.05;
			}
		}
		
		if (Character.toUpperCase(combustivel) == 'G') {
			if(nLitros <= 20) {
				aPagar = (nLitros * 5.80) - 0.04;
			}else {
				aPagar = (nLitros * 5.80) - 0.06;
			}
		}//imprime o total a pagar com o desconto
		System.out.println("Total a pagar: " + aPagar);	
		
		leia.close();
		

	}

}
