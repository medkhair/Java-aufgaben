import java.util.Scanner;
class Heron_verfahren{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wir moechten Quadratwurzel von W berechnen ");
		System.out.print("Geben Sie den Wert von a ein : ");
		double w = s.nextDouble();
		System.out.print("Wir berechnen die Quadratwurzel anhand eines Anfangswerts : ");
		double x = s.nextDouble();
		
		for (int i=0;i<=50;i++) {
			x=(x+(w/x))*0.5;
		}
		System.out.println("Quadratwurzel von "+w+" ist : "+x);
	}
}