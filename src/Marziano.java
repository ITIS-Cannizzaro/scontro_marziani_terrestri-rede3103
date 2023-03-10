public class Marziano extends Abstract_marziano{
	
	public Marziano(String matricola, int autonomia, int ai, int tecnologia) {
		super(matricola, autonomia, ai, tecnologia);
		
	}
	public void Marziano(String m, int[]param) {
		this.matricola=m;
		this.autonomia=param[0];
		this.ai=param[1];
		this.tecnologia=param[2];
		
	}
	void attaccaTerrestri(Terrestre x) {
		if(autonomia<=0) {
			System.out.println("Non posso attaccare perchè sono morto");
		}
		else
			System.out.println(x.vita=x.vita-50+ai+tecnologia);
	}
	boolean attivo() {
		if(autonomia>0) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		return "matricola: " + matricola + "\nAutonomia: " + autonomia;
	}
		
	boolean equals(Marziano x) {
		if(x.autonomia==autonomia && x.ai==ai && x.tecnologia==tecnologia) {
			return true;
		}
		else
			return false;
	}

}

