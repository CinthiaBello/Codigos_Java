package principal;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o salario e a quantidade de venda total que o vendedor fez
			no mes, e calcule o salario do mês. Há também o desconto de 5% de inss e 11% de IRPF
			sobre o salario bruto.

			Se o vendedor possui o total de venda acima de 20 mil no mês, ele recebe uma bonificação
			de 5% sobre o valor das vendas;

			Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonificação de
			3% no valor da venda;

			Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonificação de
			1% no valor da venda;

			Se o valor não passar de 10 mil, imprima uma frase motivacional;

			Todos os funcionários devem ter o contracheques detalhado, funcionários que receberam
			bonificações não devem ter descontos sobre a bonificação, indicando o mês de referencia;
		 */
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário bruto:");
		double salario = leia.nextDouble();
		System.out.println("Digite a quantidade de venda: ");
		double qntVenda = leia.nextDouble();
		double salarioFinal = 0;
		
		if(qntVenda > 20000) {
			salarioFinal = salarioLiquido(salario) * 0.05;
			System.out.println("Você teve uma bonificação de 5%!" + salarioFinal);
			
		}else
		if(15000 < qntVenda && qntVenda < 20000 ) {
			salarioFinal = salarioLiquido(salario) * 0.03;	
			System.out.println("Você teve uma bonificação de 3%!" + salarioFinal);
		}else
		if(10000 < qntVenda && qntVenda < 15000) {
			salarioFinal = salarioLiquido(salario) * 0.01;
			System.out.println("Você teve uma bonificação de 1%! " + salarioFinal);
			
		}else {
			System.out.println("Vamos melhorar!Você consegue!");
		}
		
		System.out.println("Seu salário bruto: " + salario);
		System.out.printf("Seu salário Liquido com os descontos: %.2f" , salarioLiquido(salario) );
		System.out.printf("\nSeu salário final: %.2f", salarioLiquido(salario)+ salarioFinal);
		
		leia.close();
	}
	static double salarioLiquido(double salario) {
		double descInss = salario * 0.05;
		descInss = salario - descInss;
		
		double descIR = salario * 0.11;
		descIR = salario - descIR;
		
		double salarioFinal = (descInss + descIR) - salario;
		
		return salarioFinal ;
		
	}
}
