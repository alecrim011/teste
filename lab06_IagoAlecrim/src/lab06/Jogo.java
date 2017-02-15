package lab06;

public class Jogo {
	private String nome;
	private double preco;
	private int maiorScore;
	private int qtdJogada;
	private int qtdzerada;
	
	public Jogo(String nome, double preco)throws Exception{
		if(nome.equalsIgnoreCase("") || nome == null){
			throw new Exception("nome nao pode ser vazio ou nulo");
		}
		if (preco <= 0){
			throw new Exception("preço do jogo deve ser um valor maior que zero");
		}
		this.nome = nome;
		this.preco = preco;
		
		maiorScore = 0;
		qtdJogada = 0;
		qtdzerada = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQtdJogada() {
		return qtdJogada;
	}

	public void setQtdJogada(int qtdJogada) {
		this.qtdJogada = qtdJogada;
	}

	public int getQtdzerada() {
		return qtdzerada;
	}

	public void setQtdzerada(int qtdzerada) {
		this.qtdzerada = qtdzerada;
	}

	
	
	
		
	

}
