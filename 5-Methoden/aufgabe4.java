import java.util.Scanner;
class aufgabe4{
	public static double volumen(double a,double b,double h){
		return a*b*h;
	}
	public static double Oberflaeche(double a,double b,double h){
		return 2*((a*b)+(a*h)+(b*h));
	}
	public static double Raumdiagonale(double a,double b,double h){
		return Math.sqrt((a*a)+(b*b)+(h*h));
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie die werte von ersten Kante a : ");
		double a = s.nextDouble();
		System.out.print("Geben Sie die werte von zweiten Kante b : ");
		double b = s.nextDouble();
		System.out.print("Geben Sie die werte von h (Hoehe) : ");
		double h = s.nextDouble();
		System.out.println("Das Volumen ist "+volumen(a,b,h));
		System.out.println("Die Oberflaeche  ist "+Oberflaeche(a,b,h));
		System.out.println("Die Länge der Raumdiagonale ist "+Raumdiagonale(a,b,h));
	}
}