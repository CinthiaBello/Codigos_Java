package entities;
/*Crie uma programa que fa�a o cadastro de funcion�rios, se o funcion�rio tiver um cargo de chefia ele 5% de bonifica��o 
 * sobre o salario bruto. Mostre os dados dos funcion�rios cadastrados, salario bruto, idade, e quando houver, imprima o 
 * salario com o valor da bonifica��o descrito
 */

public class CadastroFuncionarios {
	
	private String nome;
	private int idade;
	private String Cargo;
	private double salarioBruto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public void calculaSalario(double salario) {
		this.salarioBruto= salario;
	}
	
	
	public void Cadastro() {
		System.out.println("Nome do Funcion�rio: "+ nome);
		System.out.println("Idade do funcion�rio: "+ idade);
		System.out.println("Sal�rio: "+ salarioBruto);
	}
	
	

}
