class fahrzeug{
	double position, geschwindigkeit, maxgeschwindigkeit;
	int  anzahlraeder;
	public fahrzeug(){
		this.position = 0;
		this.geschwindigkeit = 0;
		this.anzahlraeder = 0;
		this.maxgeschwindigkeit = 0;
	}
	public void bewege(double minuten){
		double p2 = (this.geschwindigkeit)*(minuten/60);
		this.position += p2;
	}
	public void setzeGeschwindigkeit(double g){
		if (g<=maxgeschwindigkeit) {
			this.geschwindigkeit = g;
		}else{
			System.out.println("Das kann nicht sein !!");
		}
	}
	public double getmaxgeschwindigkeit(){
		return this.maxgeschwindigkeit;
	}
	public int getanzahlraeder(){
		return this.anzahlraeder;
	}
}
class Fahrrad extends fahrzeug{
	public Fahrrad(){
		super();
		this.anzahlraeder = 2;
		this.maxgeschwindigkeit = 30;
	}
}
class Auto extends fahrzeug{
	public Auto(){
		super();
		this.anzahlraeder = 4;
		this.maxgeschwindigkeit = 140;
	}
}
class Rennwagen extends Auto{
	public Rennwagen(){
		super();
		this.maxgeschwindigkeit = 220;
	}
}
class Krankenwagen extends Auto{
	boolean licht;
	public Krankenwagen(){
		super();
		this.licht = false;
	}
	public void einschalten(){
		this.licht =  true;
	}
	public void ausschalten(){
		this.licht = false;
	}
	public void aktuel(){
		if (this.licht == false) {
			System.out.println("ausgeschalten !!");
		}else{
			System.out.println("weeeeeeew !!");
		}
	}
}
class Wettrennen{
	public static void main(String[] args) {
		Fahrrad f = new Fahrrad();
		Auto a = new Auto();
		Rennwagen r = new Rennwagen();
		Krankenwagen k = new Krankenwagen();
		f.setzeGeschwindigkeit(20);
		a.setzeGeschwindigkeit(150);
		r.setzeGeschwindigkeit(200);
		k.setzeGeschwindigkeit(80);
		f.bewege(4*60);
		f.bewege(60);
        a.bewege(60);
        r.bewege(60);
        k.bewege(60);
        System.out.println("Fahrrad Position: " + f.position);
        System.out.println("Auto Position: " + a.position);
        System.out.println("Rennwagen Position: " + r.position);
        System.out.println("Krankenwagen Position: " + k.position);
        k.aktuel();
	}
}