/*Ein Polynom 3. Grades hat die allgemeine Form f(x)=y=ax³+bx²+cx+d.
Implementieren Sie ein Java-Programm, welches für die eingegebenen Parameter a, b, c und d eine Wertetabelle für dieses Polynom ausgibt. Dafür müsste der User natürlich noch den Startwert, den Endwert und die Schrittweite eingeben. */

import java.util.Scanner;
class polynom{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("f(x)=y=ax³+bx²+cx+d");
		System.out.print("Geben Sie den wert von a : ");
		double a = s.nextDouble();
		System.out.print("Geben Sie den wert von b : ");
		double b = s.nextDouble();
		System.out.print("Geben Sie den wert von c : ");
		double c = s.nextDouble();
		System.out.print("Geben Sie den wert von d : ");
		double d = s.nextDouble();
		System.out.print("Geben Sie einen Startwert von x :");
		double x1 = s.nextDouble();
		System.out.print("Geben Sie den Endwert von x :");
		double xf = s.nextDouble();
		System.out.print("Geben Sie die Schrittweite : ");
		double i = s.nextDouble();
		double x = x1;
		System.out.println("f(x) \t|\t x\t|");
		System.out.println("-----------------------");
		do{
			double fx=a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
			System.out.println(fx+" \t|\t "+x+"\t|");
			System.out.println("-----------------------");
			x=x+i;
		}while(x!=xf);
	}
}