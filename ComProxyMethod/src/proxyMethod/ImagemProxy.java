package proxyMethod;

public class ImagemProxy implements Desenhos {

	private Imagem Imagem;
	private String Arquivonome = "Feliz";
	
	public ImagemProxy(String nomeArquivo){
		this.Arquivonome = nomeArquivo;
	}
	
	@Override
	public void desenha() {
		if(Imagem == null) {
			System.out.println("\nCriando Imagem...\n");
			Imagem = new Imagem(Arquivonome);
		}else{
			System.out.println("\nRecuperando Imagem " + Arquivonome + " criada anteriormente...\n");
		}
		
		Imagem.desenha();
	}


}
