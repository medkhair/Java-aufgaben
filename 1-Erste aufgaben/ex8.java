import java.util.Scanner;
class ex8{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		double zs,m,p,d,e;
		System.out.print("Geben Sie den aktuellen Zählerstand an : ");
		zs = S.nextDouble();
		System.out.print("Geben Sie den monatlichen Abschlag vom letzten Jahr an : ");
		m = S.nextDouble();
		System.out.print("Geben Sie die dKw/h-Preis an : ");
		p = S.nextDouble();
		d = (zs - m)*p;
		e= -d;
		if(d<0){
			System.out.println(" Sie erhalten eine Rückerstattung von " + e);
		}else{
			System.out.println(" Sie muessen noch " + d + "zahlen");

		}
	}
}