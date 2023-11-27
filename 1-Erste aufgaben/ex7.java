import java.util.Scanner;
class ex7{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double as,us,sl,zs,g;
		System.out.print("Geben Sie die Arbeitstunden : ");
		as = S.nextDouble();
		System.out.print("Geben Sie die uberstunden : ");
		us = S.nextDouble();
		System.out.print("Geben Sie die stundenlohn : ");
		sl = S.nextDouble();
		zs = sl*us*0.2;
		g = ((as+us)*sl)+zs;
		System.out.println("Das Gehalt ist :  "+ g);
	}
} 