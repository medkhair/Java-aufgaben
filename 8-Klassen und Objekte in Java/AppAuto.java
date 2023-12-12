import java.util.Scanner;
class Auto{
	private String KFZk;
	private double Kilo, tv, kv, km;
	public Auto(String kk, double k, double t, double kv, double km){
		this.KFZk = kk;
		this.Kilo = k;
		this.tv = t;
		this.kv = kv;
		this.km = km;
		km = 0;
	}
	public void tanken(double menge){
		if(menge == this.tv){
			System.out.println("der tank ist voll");
		}else if (menge <= this.tv){
			System.out.println("die menge ist : "+menge+" L");
		}else if (menge > this.tv){
			System.out.println("das kann nicht sein !! weil "+menge+" L > "+this.tv+" L");
		}
	}
	public void fahren(double strecke){
		double verbrauch = (strecke/100) * this.kv;
		this.Kilo = strecke + this.Kilo;
		this.kv = this.kv - verbrauch;
		System.out.println("der Kilometerstand ist : "+this.Kilo);
		System.out.println("Verbleibender Kraftstoff ist : "+this.kv);
	}
}
class AppAuto{
	public static void main(String[] args) {
		Auto a1 = new Auto("09A546",0,5,7.7,130);
		Auto a2 = new Auto("02A336",13000,6,7.7,130);
		Scanner sc = new Scanner(System.in);
		System.out.println("Erstes Auto ");
		System.out.println("---------------");
		System.out.print("Geben Sie die Menge in Liter ein : ");
		double m1 = sc.nextDouble();
		a1.tanken(m1);
		System.out.print("Geben Sie die Strecke in Kilometer ein : ");
		double s1 = sc.nextDouble();
		a1.fahren(s1);
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println("Zweites Auto ");
		System.out.println("---------------");
		System.out.print("Geben Sie die menge in Liter ein : ");
		double m2 = sc.nextDouble();
		a2.tanken(m2);
		System.out.print("Geben Sie die Stercke in Kilometer ein : ");
		double s2 = sc.nextDouble();
		a2.fahren(s2);
	}
}