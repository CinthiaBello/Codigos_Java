package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular("Cinthia");
		//System.out.println("Nome do titular: " + conta.getTitular());
		conta.setAgencia ("2456-x");
		conta.setNumeroConta(2065);
		//conta.setSaldo( 30.00);não funciona mais
		
		conta.depositar(300.00);
		
		conta.obterDadosBancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosBancarios();

	}

}
