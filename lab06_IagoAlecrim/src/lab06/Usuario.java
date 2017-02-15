package lab06;

import java.util.HashSet;
import java.util.Set;

public abstract class Usuario {
	private String nome;
	private Set<Jogo> jogosComprados;
	private double dinheiro;
	protected int x2p;
	
	
	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	public Usuario(String nome, double dinheiro)throws Exception{
		if(nome.equalsIgnoreCase("") || nome == null){
			throw new Exception("nome nao pode ser vazio ou nulo");
		}
		
		if (dinheiro < 0){
			throw new Exception("dinheiro nao pode ser negativo");
		}
		this.nome = nome;
		this.dinheiro = dinheiro;
		
		Set<Jogo> jogosComprados = new HashSet<Jogo>();
	}
	
	abstract boolean compraJogo(Jogo j);
	
	public void adicionaDinheiro(double aumentaDinheiro){
		dinheiro += aumentaDinheiro;
	}
	
	public boolean adicionaJogo(Jogo j){
		return jogosComprados.add(j);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Jogo> getJogosComprados() {
		return jogosComprados;
	}

	public void setJogosComprados(Set<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

}
