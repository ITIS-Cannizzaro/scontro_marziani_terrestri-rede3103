public class Terrestre extends Abstract_terrestre{

	public Terrestre(String nome, int vita, int velocita, int armamento) {
		super(nome, vita, velocita, armamento);
	}
	
	public void terrestre(String n, int[]param1) {
		this.nome=n;
		this.vita=param1[0];
		this.velocita=param1[1];
		this.armamento=param1[2];
		
	}
	void attaccaMarziani(Marziano x) {
		if(vita<=0) {
			System.out.println("Non posso attaccare perchè sono morto");
		}
		else
			System.out.println(x.autonomia=x.autonomia-20+velocita+armamento);
	}
	boolean vivo() {
		if(vita>0) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		return "nome: " + nome + "\nVita: " + vita;
	}
		
	boolean equals(Terrestre x) {
		if(x.vita==vita && x.velocita==velocita && x.armamento==armamento) {
			return true;
		}
		else
			return false;
	}

	
	
}
