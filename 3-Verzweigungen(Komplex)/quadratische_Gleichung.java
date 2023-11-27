import java.util.Scanner;
import java.lang.Math;
class quadratische_Gleichung{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("wir wollen diese Gleichung Y=aX^2+bX+c");
		System.out.print("Geben Sie den Wert von a : ");
		double a=s.nextDouble();
		System.out.print("Geben Sie den Wert von b : ");
		double b=s.nextDouble();
		double b2=Math.pow(b,2);
		System.out.print("Geben Sie den Wert von c : ");
		double c=s.nextDouble();
		double d=b2-(4*a*c);
		if(d<0){
			System.out.println("Keine Loesung");
		}else if (d==0) {
			System.out.println("Diese Gleichung hat nur eine Loesung x = "+(-b/(2*a)));
		}else if (d>0) {
			System.out.println("Diese Gleichung hat zwei Loesungen x1 = "+((-b+d)/(2*a))+" und x2 = "+((-b-d)/(2*a)));
		}
	}
}
