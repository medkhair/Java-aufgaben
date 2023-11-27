import java.util.Scanner;
class ex5{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double l,b,o,p,r1,r2;
		do{
			System.out.print("Geben Sie die laenge : ");
			l = S.nextDouble();
		}while(l<=0);
		do{
			System.out.print("Geben Sie die Breite : ");
			b = S.nextDouble();
		}while(b<=0);
		o = l*b;
		do{
			System.out.print("Geben Sie die Quadratmeterpreis : ");
			p = S.nextDouble();
		}while(p<=0);
		r1 = (p*o);
		System.out.println("Die rechnung ohne TVA ist : " + r1);
		System.out.println("TVA ist : " + r1*0.03);
		r2 = r1+(r1*0.03);
		System.out.println("Der Gesamtbetrag (+TVA) ist : " + r2);
		S.close();
	}
}