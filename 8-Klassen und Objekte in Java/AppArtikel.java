class Spieler{
	public String position, name, team, nationalitaet;
	public int power;
	public konditionen k;
	public Spieler(String p, String n, String t, String nat, int pow, konditionen k ){
		this.position = p;
		this.name = n;
		this.team = t;
		this.nationalitaet = nat;
		this.power = pow;
		this.k = k;
	}
	public void anzeigen(){
		System.out.println("Spieler ist : "+this.name);
		System.out.println("position: "+this.position);
		System.out.println("team : "+this.team);
		System.out.println("nationalitaet : "+this.nationalitaet);
		System.out.println("OVR : "+this.power);
		System.out.println("Pac : "+this.k.pac);
		System.out.println("sho : "+this.k.sho);
		System.out.println("Pas : "+this.k.pas);
		System.out.println("Dri : "+this.k.dri);
		System.out.println("Def : "+this.k.def);
		System.out.println("Phy : "+this.k.phy);
		System.out.println("____________________________");
	}
}
class konditionen{
	public int pac,sho,pas,dri,def,phy;
	public konditionen(int pac,int sho,int pas,int dri,int def,int phy){
		this.pac = pac;
		this.sho = sho;
		this.pas = pas;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
	}
}
class AppArtikel{
	public static void main(String[] args) {
		konditionen k1 = new konditionen(75,91,79,86,44,83);
		Spieler s1 = new Spieler("ST","Lewandowski","FC Barcelona","Poland",91,k1);
		s1.anzeigen();
		konditionen k2 = new konditionen(90,92,67,82,50,88);
		Spieler s2 = new Spieler("ST","Haaland","Man city","Norwegen",89,k2);
		s2.anzeigen();
		konditionen k3 = new konditionen(90,83,80,88,44,77);
		Spieler s3 = new Spieler("LM","Mane","FC Bayern","Senegal",89,k3);
		s3.anzeigen();
	}
}