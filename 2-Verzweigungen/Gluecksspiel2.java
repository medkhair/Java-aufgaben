import java.lang.Math;
import java.util.Scanner;
class Gluecksspiel2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zufall = (int) (Math.random()*100 + 1);
		int s1,s2;
		System.out.print("Tipp Spieler 1: ");
		s1 = s.nextInt();
		System.out.print("Tipp Spieler 2: ");
		s2 = s.nextInt();
		System.out.println("Zufallszahl : "+zufall );
		int a = Math.abs(zufall-s1); int b = Math.abs(zufall-s2);
		if (a>b) {
			System.out.println("Spieler 2 hat gewonnen !!");
		}else if (a<b) {
			System.out.println("Spieler 1 hat gewonnen !!");
		}else{
			System.out.println("Unentschieden !!");
		}
		
	}
}