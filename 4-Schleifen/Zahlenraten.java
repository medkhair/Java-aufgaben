import java.lang.Math;
import java.util.Scanner;
class Zahlenraten{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zufallszahl = (int) ((Math.random() *100)) + 1;
		int a;
		System.out.println(zufallszahl);
		int i=0;
		do{
				System.out.print("Geben Sie eine Zahl ein : ");
				a=s.nextInt();
				if(zufallszahl<a){
					System.out.println("Die Zahl ist zu gross");
				}else if (zufallszahl>a) {
					System.out.println("Die Zahl ist zu klein");
				}
				i=1+i;	
		}while(zufallszahl!=a);
		System.out.println("Treffer");
		System.out.println("du hast "+i+" Mal versucht");
	}
}