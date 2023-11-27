import java.util.Scanner;
class Nim_Spiel{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int aw,a;
		System.out.print("Geben Sie die Anzahl der Starthölzer ");
		int as = s.nextInt;
		do{
			System.out.print("Geben Sie die Anzahl der Starthölzer ");
			aw = s.nextInt();
			System.out.print("fehler ! ");
		}while(aw>=as);
	}
}