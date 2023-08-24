package principal;

import java.util.Scanner;

import entities.Cargo;
import entities.CadastroFuncionarios;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		String nome;
		double salario;
		int idade; 
		char cargos;
		char continua;
		do {
			System.out.println("Informe seu cargo: c-chefia f-funcionário ");
			cargos=leia.next().charAt(0);
			System.out.println("Informe o nome: ");
			nome=leia.next();
			System.out.println("Informe o salário ");
			salario=leia.nextDouble();
			System.out.println("Informe sua idade ");
			idade=leia.nextInt();
			
			if (cargos== 'c') {
				Cargo cargo = new Cargo();
				cargo.calculaSalario(salario);
				cargo.setIdade(idade);
				cargo.setNome(nome);
				cargo.Cadastro();
			} else {
				CadastroFuncionarios cadastroFuncionarios = new CadastroFuncionarios();
				cadastroFuncionarios.calculaSalario(salario);
				cadastroFuncionarios.setIdade(idade);
				cadastroFuncionarios.setNome(nome);
				cadastroFuncionarios.Cadastro();
			}	
			System.out.println("Deseja informar outro funcionário? s-sim n- não ");
			continua=leia.next().charAt(0);
		} while (continua == 's');
		
		
		leia.close();
	}

}
