package entities;

public class Cargo extends CadastroFuncionarios {

		private double salario;

		@Override
		public void calculaSalario(double salario) {
			this.salario = salario + (salario * 0.05); 
		}
	

}
