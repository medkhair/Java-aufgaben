import java.util.Scanner;
class Scheinausgabe{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Wie groß ist der Geldbetrag: ");
		int g = s.nextInt();
		int e500,e200,e100,e50,e20,e10,e5;
		int r1,r2,r3,r4,r5,r6,r7;
		
			e500 = g/500;
			r1 = g%500;
			System.out.println("500er-Scheine: "+e500);
			e200 = r1/200;
			r2 = r1%200;
			System.out.println("200er-Scheine: "+e200);
			e100 = r2/100;
			r3 = r2%100;
			System.out.println("100er-Scheine: "+e100);
			e50 = r3/50;
			r4 = r3%50;
			System.out.println("50er-Scheine: "+e50);
			e20 = r4/20;
			r5 = r4%20;
			System.out.println("20er-Scheine: "+e20);
			e10 = r5/10;
			r6 = r5%10;
			System.out.println("10er-Scheine: "+e10);
			e5= r6/5;
			System.out.println("5er-Scheine: "+e5);
		
	}
}