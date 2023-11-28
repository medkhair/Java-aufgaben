import java.util.Scanner;
class aufgabe5{
	public static void produkt(int a, int b){
		for (int i=a;i<=10 ;i++) {
			for (int j=b;j<=10;j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Geben sie die erste Zahl : ");
		int a = s.nextInt();
		System.out.print("Geben sie die zweite Zahl : ");
		int b = s.nextInt();
		produkt(a,b);
	}
}