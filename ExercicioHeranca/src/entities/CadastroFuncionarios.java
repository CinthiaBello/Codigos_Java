package entities;
/*Crie uma programa que faça o cadastro de funcionários, se o funcionário tiver um cargo de chefia ele 5% de bonificação 
 * sobre o salario bruto. Mostre os dados dos funcionários cadastrados, salario bruto, idade, e quando houver, imprima o 
 * salario com o valor da bonificação descrito
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
		System.out.println("Nome do Funcionário: "+ nome);
		System.out.println("Idade do funcionário: "+ idade);
		System.out.println("Salário: "+ salarioBruto);
	}
	
	

}
