import java.util.Scanner;
class Schnittpunkt{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("wir haben 2 Funktionen g(x)=ax+b und h(x)=cx+d");
		System.out.println("und wir moechten den Schnittpunkt finden");
		System.out.print("Bitte geben Sie den Wert von a ein : ");
		double a = s.nextDouble();
		System.out.print("Bitte geben Sie den Wert von b ein : ");
		double b = s.nextDouble();
		System.out.print("Bitte geben Sie den Wert von c ein : ");
		double c = s.nextDouble();
		System.out.print("Bitte geben Sie den Wert von d ein : ");
		double d = s.nextDouble();
		
		if (a==c && b==d) {
			System.out.println("dann sind die beiden Geraden identisch und haben unendlich viele Schnittpunkte.");
		}else if (a==c) {
			System.out.println("Die beiden Geraden sind parallel und es gibt keinen Schnittpunkt");
		}else{
			double x = (d - b) / (a - c);
			double y = a * ((d - b) / (a - c)) + b;
			System.out.println("Die Koordinaten dieses Schnittpunkts sind ("+x+" ,"+y+")");
		}
		s.close(); 

	}
}