import java.util.Scanner;
import java.lang.Math;
class Dreiecke{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b,c;
		double a2,b2,c2;
		System.out.print("Geben Sie die Länge a des Dreiecks an : ");
		a = s.nextDouble();
		System.out.print("Geben Sie die Länge b des Dreiecks an : ");
		b = s.nextDouble();
		System.out.print("Geben Sie die Länge c des Dreiecks an : ");
		c = s.nextDouble();
		a2=Math.pow(a,2); b2=Math.pow(b,2); c2=Math.pow(c,2);
		if (a + b > c || a + c > b || b + c > a ) {
			System.out.println("Das ist ein Dreieck ! ");
			if(a == b && a == c && b == c){
				System.out.println("genau ein gleichseitiges Dreieck ! ");
			}else if(a2+b2==c2 || a2+c2==b2 || b2+c2==a2){
				System.out.println("genau ein rechtwinkliges Dreieck ! ");
			}
		}else{
			System.out.println("Das ist kein Dreieck ! ");
		}
	}
}