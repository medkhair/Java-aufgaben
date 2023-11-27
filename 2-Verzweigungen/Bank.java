import java.util.Scanner;
class Bank{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double g;
		System.out.println("Ihr Guthaben betraegt 136.34 Euro.");
		System.out.print("Wieviel Geld wollen Sie abheben? ");
		g = s.nextDouble();
		if(g>136.34){
			System.out.println("Keine Auszahlung! Dieser Betrag uebersteigt Ihr Guthaben.");
		}else{
			System.out.println("Es werden "+g+ " Euro ausgezahlt.");
		}
		s.close();
	}
}