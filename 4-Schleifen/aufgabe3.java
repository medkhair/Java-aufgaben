import java.util.Scanner;
class aufgabe3{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0;
		int a=0;
		do{
			i=i+a;
			System.out.print("Gib eine zahl : ");
			a = s.nextInt();
		}while(a>=0);
		System.out.println("Die summe nachdem,Sie eine negative zahl eingegeben haben : "+i);
	}
}