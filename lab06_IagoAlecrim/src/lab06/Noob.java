package lab06;

public class Noob extends Usuario {
	

	public Noob(String nome, double dinheiro) throws Exception {
		super(nome, dinheiro);
		x2p = 0;
		
	}

	@Override
	boolean compraJogo(Jogo j) {
		if (this.getDinheiro() >= j.getPreco() * 0.9){
			this.adicionaJogo(j);
			int pontos = (int)(j.getPreco() * 10) + this.getX2p();
			this.setX2p(pontos);
		}
		
		return false;
	}

}
