public class Terreno_di_Gioco {
	public static void main(String[] args){
		Marziano m1=new Marziano("", 0, 0, 0);
		Marziano x102=new Marziano("", 0, 0, 0);
		Terrestre t1=new Terrestre("", 0,0,0);
		Terrestre Ken=new Terrestre("", 0,0,0);
		
		String n="Ken";
		String m="x102";
		int[]param=new int[3];
		int[]param1=new int[3];
		param[0]=50;
		param[1]=5;
		param[2]=5;
		param1[0]=75;
		param1[1]=10;
		param1[2]=6;
		x102.Marziano(m, param);
		Ken.terrestre(n, param1);
		System.out.println(x102.equals(m1));
		System.out.println(Ken.equals(t1));
		boolean a=x102.attivo();
		if(a==true){
			
		}
		boolean b=Ken.vivo();
		x102.attaccaTerrestri(Ken);
		Ken.attaccaMarziani(x102);
		

	}

}
