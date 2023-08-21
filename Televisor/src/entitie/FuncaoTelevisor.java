package entitie;

import java.util.Scanner;

public class FuncaoTelevisor {
	Scanner leia = new Scanner(System.in);
	public int volume;
	public int canal;
	public boolean ligado; 
	
	public void aumentarVolume() {
		if( 0 <= volume && volume < 16){
		  volume+= 1;
		  }
	}
	public void diminuirVolume() {
		if( 0 <= volume && volume < 16){
		  volume-= 1;
		  }
	}
	public void aumentarCanal() {
		if (canal == 0) canal = 1;
		if(canal >=1 && canal<=15) {
			canal+=1;
		}
	}
	public void diminuirCanal() {
		if (canal == 0) canal = 1;
		if(canal >=1 && canal<=15) {
			canal-=1;
		}
	}	         
			public void ligarTelevisor() {
				canal = 1;
				ligado = true;
			}
			public void desligarTelevisor() {
				ligado = false;
			}
			public void mostrarStatus() {
				if(ligado == true) {
					System.out.println("Tv ligada!");
					System.out.println("Canal: "+ canal);
					System.out.println("Volume: "+ volume);
				}else {
					System.out.println("Tv desligada!");
				}
			}
			
	
	

}
