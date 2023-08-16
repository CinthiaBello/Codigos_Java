package entities;

public class Carro {
	
	public String modelo;
	public String placa;
	public String cor;
	public String ano;
	
	public int velocidade=0;
	
	public void acelerarVeiculo() {
		velocidade+=1;
	}
	

}
