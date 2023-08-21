package principal;

import entitie.FuncaoTelevisor;

public class program {

	public static void main(String[] args) {
		FuncaoTelevisor tv = new FuncaoTelevisor();
		tv.mostrarStatus();
		tv.ligarTelevisor();
		tv.mostrarStatus();

	}

}
