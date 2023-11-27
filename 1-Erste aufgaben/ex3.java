import java.util.Scanner;
class ex3{
	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Geben sie den Radius : ");
		double r = Scanner.nextDouble();
		System.out.print("Geben sie die Hoehe : ");
		double h = Scanner.nextDouble();
		double s=Math.sqrt((h*h)+(r*r));
		System.out.println("die Seitenlinie ist  : " + s);
		double o = pi*r*(r+h);
		System.out.println("die oberflaeche ist  : " + o);
		double v = (1.0 / 3)*r*r*h*pi;
		System.out.println("das volumen ist  : " + v);
		Scanner.close();
	}
}