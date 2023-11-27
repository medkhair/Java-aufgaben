import java.util.Scanner;
class ex10{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String a,b,c,d;
		double p1,p2,p3,p4,q1,q2,q3,q4,s,z,g;
		System.out.print("geben sie das produkt 1 : ");
		a = S.nextLine();
		System.out.print("geben sie den anzahl :");
		q1 = S.nextDouble();
		do{
			System.out.print("geben sie die preise : ");
			p1 = S.nextDouble();
		}while(p1<0);
		S.nextLine();
		System.out.print("geben sie das produkt 2 : ");
		b = S.nextLine();
		System.out.print("geben sie den anzahl :");
		q2 = S.nextDouble();
		do{
			System.out.print("geben sie die preise : ");
			p2 = S.nextDouble();
		}while(p2<0);
		S.nextLine();
		System.out.print("geben sie das produkt 3 : ");
		c = S.nextLine();
		System.out.print("geben sie den anzahl :");
		q3 = S.nextDouble();
		do{
			System.out.print("geben sie die preise : ");
			p3 = S.nextDouble();
		}while(p3<0);
		S.nextLine();
		System.out.print("geben sie das produkt 4 : ");
		d = S.nextLine();
		System.out.print("geben sie den anzahl :");
		q4 = S.nextDouble();
		do{
			System.out.print("geben sie die preise : ");
			p4 = S.nextDouble();
		}while(p4<0);
		
		s = (q1*p1)+(q2*p2)+(q3*p3)+(q4*p4);
		do{
		System.out.print("wie viel hat er gegeben ? : ");
		g = S.nextDouble();
	    }while(g<s);
	    System.out.println("                                             " );
		System.out.println("                                             " );
		z = g-s;
		System.out.println(a +"        "+ q1 +" x "+p1 + "EUR" );
		System.out.println("                             "+ (q1*p1) +"EUR" );
		System.out.println(b +"        "+ q2 +" x "+p2 + "EUR" );
		System.out.println("                             "+ (q2*p2) +"EUR" );
		System.out.println(c +"        "+ q3 +" x "+p3 + "EUR" );
		System.out.println("                             "+ (q3*p3) +"EUR" );
		System.out.println(d +"        "+ q4 +" x "+p4 + "EUR" );
		System.out.println("                             "+ (q4*p4) +"EUR" );
		System.out.println("---------------------------------------------" );
		System.out.println("                                             " );
		System.out.println("Gesamt                            " + s +"EUR" );
		System.out.println("gegeben                           " + g +"EUR" );
		System.out.println("                                             " );
		System.out.println("                                             " );
		System.out.println("zurruck                           " + z +"EUR" );
	}
}