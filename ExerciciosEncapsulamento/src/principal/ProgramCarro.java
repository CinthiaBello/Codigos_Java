package principal;

import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		System.out.println("Digite o modelo do carro: ");
		carro.setModelo(leia.nextLine());
		System.out.println("Digite o ano do carro: ");
		carro.setAno(leia.nextInt());
		leia.nextLine();
		System.out.println("Digite a cor do carro: ");
		carro.setCor(leia.nextLine());
		System.out.println("Digite qual o cambio do carro: ");
		carro.setCambio(leia.nextLine());
		System.out.println("Digite o motor do carro: ");
		carro.setMotor(leia.nextDouble());
		
		carro.caracteristicasCarro();
		
		
		
		leia.close();
		
	}

}
