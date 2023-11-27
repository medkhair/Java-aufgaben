import java.util.Scanner;
class Versandgeschaeft{
	public static void main(String[] args) {
		double r,g,p=2,v=3;
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie den Rechnungsbetrag : ");
		r = s.nextDouble();
		if(r<=100){
			g=r+p+v;
			System.out.println("Sie muessen "+g+" Euro zahlen");
		}else if (r<200 && r>100) {
			g=r+p;
			System.out.println("Sie muessen "+g+" Euro zahlen");
		}else if (r>=200) {
			System.out.println("Sie muessen "+r+" Euro zahlen");
		}
	}
}
