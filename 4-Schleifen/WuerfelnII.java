import java.util.Scanner;
import java.lang.Math;
class WuerfelnII{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int minA=1;
		int maxA=6;
		int wurf;
		int summe=0;
		int a;
		int i=0;
		do{
			wurf = minA + (int) (Math.random() * ((maxA - minA) + 1));
			i++;
			System.out.println((i)+"- itteration : "+wurf);
			do{
				System.out.print("Wollen Sie noch die Wuerfel werfen ? ja=0 / nein=1 :  ");
				a = s.nextInt();
			}while(a!=1 && a!=0);
		}while(a==0);
		System.out.println("Sie haben die Wuerfel "+i+" mal geworfen ");
	}
}