package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		System.out.println("Conta normal:");
		conta.setTitular("Cinthia");
		conta.setAgencia(145478);
		conta.setNumeroConta(22332233);
		conta.depositar(150.56);
		conta.sacar(50);
		
		conta.obterDadosbancarios();
		
		cc.setTitular("Cinthia");
		cc.setAgencia(145478);
		cc.setNumeroConta(22332233);
		cc.depositar(550.95);
		cc.sacar(250);
		
		cc.obterDadosbancarios();
		
		cp.setTitular("Cinthia");
		cp.setAgencia(145478);
		cp.setNumeroConta(22332233);
		cp.depositar(550.95);
		cp.sacar(250);
		
		cp.obterDadosbancarios();
	}

}
