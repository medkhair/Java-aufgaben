import java.util.Scanner;
class ex2{
	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner Scanner = new Scanner(System.in);
		System.out.print("geben sie den innenradius ");
		double rk = Scanner.nextDouble();
		double rg;
		do{
			System.out.print("geben sie den aussenradius ");
			rg = Scanner.nextDouble();
		}while(rg<=rk);
		double F = (pi*rg*rg)-(pi*rk*rk);
		System.out.println("Die flaecheninhalt dieses Kreisrings ist : "+ F);
		Scanner.close(); 
    }
} 