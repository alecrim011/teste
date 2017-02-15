package lab06;

public class hehe {
	public static void main(String[] args) throws Exception{
	Jogo j = new Jogo("tlou", 190.90);	
	Usuario u = new Noob("gabi", 500.20);
	Usuario r = new Veterano("iago", 300.50);
	Jogo y = new Jogo("metal gear", 1300.90);
	
	r.compraJogo(y);
	u.adicionaDinheiro(1000.59);
	u.compraJogo(j);
	System.out.println(u.getDinheiro());
	System.out.println(u.getX2p());
	System.out.println(r.getX2p());
	System.out.println(r.getDinheiro());
	}
	
	
	
}
			
			


