import java.util.Scanner;
class Nim_Spiel{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int aw,a;
		System.out.print("Geben Sie die Anzahl der Starthoelzer : ");
		int as = s.nextInt();
		System.out.print("Geben Sie die Anzahl der jeweils wegzunehmenden Hoelzer : ");
		aw = s.nextInt();
		do{
			System.out.print("Spieler 1, deine Runde : ");
			int sp1=s.nextInt();
			if (sp1>aw || sp1>=as) {
				do{
					System.out.println("Fehler !!");
					sp1=s.nextInt();
				}while(sp1>aw || sp1>=as);
			}
			as=as-sp1;
			if (as==1) {
				System.out.println("Spieler 2 hat gewonnen ! ");
			}else{
				System.out.println("nur noch "+as+" Starthoelzer ");
				System.out.print("Spieler 2, deine Runde : ");
				int sp2=s.nextInt();
				if (sp2>aw || sp2>=as) {
					do{
						System.out.println("Fehler !!");
						sp2=s.nextInt();
					}while(sp2>aw || sp2>=as);
				}
				as=as-sp2;
				if (as==1) {
					System.out.println("Spieler 1 hat gewonnen ! ");
				}else{
					System.out.println("nur noch "+as+" Starthoelzer ");
				}
			}
		}while(as!=1);
	}
}