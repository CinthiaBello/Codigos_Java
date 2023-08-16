package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		//Classe é um molde para objeto***
		
		// conceito de carro
		
		//caracteristicas(atributos)
		
		/*comportamento(metodo/função)
		 * ex: acelerar, freiar, acender faróis
		*/

		/*Classes tem muitos recursos, como:
		 * sobre carga de metodos e construtores
		 * 4 pilares podem ser aplicados
		 * Pacotes:
		 * Eentities(entidades do sistema) de acordo com a modelagem de negócios:
		 * carro, pessoa, entereço...
		 * Services: ClienteService, E-mail, serviços...
		 * Controllers
		 * utilidaes: Math
		 */
		Scanner leia = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro CarroPopular = new Carro();
		
		carro.modelo = "Celta";
		carro.ano = "2010";
		carro.placa = "xpt-9999";
		carro.cor = "Azul";
		
		CarroPopular.modelo = "Gol";
		CarroPopular.placa = "xpt-8888";
		CarroPopular.cor = "vermelho";
		
		/*System.out.println("Entre com o ano do carro: ");
		CarroPopular.ano = leia.next();
		
		System.out.println(carro.ano);
		System.out.println(CarroPopular.ano);*/
		
		System.out.println(carro.velocidade);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.velocidade);
		carro.velocidade = 10;
		
		System.out.println(carro.velocidade);
	}

}
