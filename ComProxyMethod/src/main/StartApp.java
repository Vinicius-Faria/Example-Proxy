package main;

import proxyMethod.Desenhos;
import proxyMethod.ImagemProxy;

public class StartApp {
	
	public static void main(String[] args) {
		
		Desenhos desenhos = new ImagemProxy("Feliz");
		
		desenhos.desenha();
		System.out.println();
		
		desenhos.desenha();
		System.out.println();
		
	}

}
