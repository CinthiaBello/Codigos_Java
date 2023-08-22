package entities;
//1) crie um programa que receba os dados de um carro com os seguintes atributos: modelo, ano, cor, motor, 
//cambio e velocidade e os métodos para aumentar e diminuir a velocidade; use scanner

import java.util.Scanner;

public class Carro {
	Scanner leia = new Scanner(System.in);
	
	private String modelo;
	private int ano;
	private String cor;
	private double motor;
	private String cambio;
	private double velocidade;
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void aumentarVelocidade() {
		velocidade += 1;		 
	}
	
	public void diminuirVelocidade() {
		velocidade -= 1;	
	}
	public void caracteristicasCarro() {
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "+ ano);
		System.out.println("Cor: "+ cor);
		System.out.println("Motor: "+ motor);
		System.out.println("Cambio: "+ cambio);
		
		
	}
	
	
	


	
	
}
