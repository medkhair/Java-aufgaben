import java.util.Scanner;
class Werkzeugladen{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sch=5,m=3,u=1;
		int as,am,au,g;
		System.out.print("Geben Sie die Anzahl der Schrauben : ");
		as=s.nextInt();
		System.out.print("Geben Sie die Anzahl der Muttern : ");
		am=s.nextInt();
		System.out.print("Geben Sie die Anzahl der Unterlegscheiben  : ");
		au=s.nextInt();
		g=sch*as+m*am+u*au;
		if(as>au){
			System.out.println("Kontrollieren Sie Ihre Bestellung!");

		}else{
			System.out.println("Die Bestellung ist okay.");
		}
		System.out.println("Der Gesamtbetrag ist : "+g +" Cent");

	}
}