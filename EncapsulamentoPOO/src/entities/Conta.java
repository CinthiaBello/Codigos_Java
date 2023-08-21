package entities;

public class Conta {
	private String titular;
	private String agencia;
	private int numeroConta;
	private double saldo;
	
	//get == Obter
	public String getTitular() {
		return titular;
	}
	
	//set == atribui valor
	//this == identifica o atributo da classe
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//Atalho = alt + shift + s
	
	public void depositar(double valorDeposito) {
		saldo+= valorDeposito;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valorSaque) {
		saldo-= valorSaque;
	}
	
	public void obterDadosBancarios() {
		System.out.println("Titular: " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
}
