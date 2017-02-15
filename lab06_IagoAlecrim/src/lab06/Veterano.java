package lab06;

public class Veterano extends Usuario {
	
	public Veterano(String nome, double dinheiro) throws Exception {
		super(nome, dinheiro);
		x2p = 1000;
	}

	@Override
	boolean compraJogo(Jogo j) {
		if (this.getDinheiro() >= j.getPreco() * 0.8){
			this.adicionaJogo(j);
			int pontos = (int)(j.getPreco() * 15) + this.getX2p();
			this.setX2p(pontos);
		}
		
		
		return false;
	}
	

}
