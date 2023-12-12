import java.util.Scanner;
class Bankkonto{
	private String name, vorname, kontonummer;
	private double kontostand,limit;
	public Bankkonto(String n, String v, String kn, double ks, double l){
		this.name = n;
		this.vorname = v;
		this.kontonummer = kn;
		this.kontostand = ks;
		this.limit = l;
	}
	public void ausgabe(){
		System.out.println("Name : "+this.name);
		System.out.println("Vorname : "+this.vorname);
		System.out.println("kontonummer : "+this.kontonummer);
		System.out.println("kontostand : "+this.kontostand+" Euro");
	}
	public void einzahlung(double ez){
		this.kontostand += ez;
	}
	public void auszahlung(double az){
		this.kontostand -= az;
	}
	public void abfrage(){
		System.out.println("kontostand : "+this.kontostand+" Euro");
	}
}
class konto{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bankkonto bk = new Bankkonto("Schweinsteiger","Rico","5013025154789433",5000,1000000);
		bk.ausgabe();
		System.out.print("moechten Sie einzahlen ? / ja = 1 / nein = 0 ");
		int e = sc.nextInt();
		if(e==1){
			System.out.print("wie viel moechten Sie einzahlen : ");
			double e1 = sc.nextDouble();
			bk.einzahlung(e1);
		}
		System.out.print("moechten Sie auszahlen ? / ja = 1 / nein = 0 ");
		e = sc.nextInt();
		if(e==1){
			System.out.print("wie viel moechten Sie auszahlen : ");
			double az1 = sc.nextDouble();
			bk.auszahlung(az1);
		}
		System.out.print("moechten Sie nach dem  Kontostand abfragen ? / ja = 1 / nein = 0 ");
		e = sc.nextInt();
		if(e==1){
			bk.abfrage();
		}
	}
}