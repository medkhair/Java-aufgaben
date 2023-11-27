import java.util.Scanner;
class aufgabe6{
	public static void aufzinsen(double gk,double zs,int aj ){
		double k=gk*Math.pow((1+zs),aj);
		System.out.println("Das kapital nach " + aj + " Jahren ist : " + k);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double gk,zs;
		int aj;
		System.out.print("Geben Sie das Grundkapital : ");
		gk=s.nextDouble();
		System.out.print("Geben Sie der Zinssatz : ");
		zs=s.nextDouble();
		System.out.print("Geben Sie die Anzahl der Jahre  : ");
		aj=s.nextInt();
		aufzinsen(gk,zs,aj);
	}
}