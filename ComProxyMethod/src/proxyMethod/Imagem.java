package proxyMethod;

public class Imagem implements Desenhos {


private String imagem;
	
	public Imagem(String imagem) {
		this.imagem = imagem;
		carregandoImagem(imagem);
	}

	@Override
	public void desenha() {
		System.out.println("Desenhando imagem: \n"
				+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
				+ "░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░\r\n"
				+ "░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░\r\n"
				+ "░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░\r\n"
				+ "░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░\r\n"
				+ "░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░\r\n"
				+ "░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░\r\n"
				+ "░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░\r\n"
				+ "░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░\r\n"
				+ "░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░\r\n"
				+ "░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░\r\n"
				+ "░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░\r\n"
				+ "░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░\r\n"
				+ "░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░\r\n"
				+ "░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░\r\n"
				+ "░░░░█░░░░░░░░░░░░░░░░░░░░░█░░\r\n"
				+ "░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░\r\n"
				+ "░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░\r\n"
				+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
				+ "________O Feliz________");
	}
	
	private void carregandoImagem(String imagem) {
		System.out.println("Carregando arquivo " + imagem + " do banco de dados.\n");
	}
	
}
