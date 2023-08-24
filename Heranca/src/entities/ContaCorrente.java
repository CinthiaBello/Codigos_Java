package entities;

public class ContaCorrente extends Conta{
	
	@Override
	public void sacar(double saque) {
		saldo -= saque +2.00;
	}
	

}
