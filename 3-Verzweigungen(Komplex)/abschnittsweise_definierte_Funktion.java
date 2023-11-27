import java.util.Scanner;

class abschnittsweise_definierte_Funktion{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Geben sie den Wert von x (-3<x<4) ");
		double x = s.nextDouble();
		double y;
		double x2 = x*x;
		if(x<=-1 && x>=-3){
			y=(2)+x;
			System.out.println("F(x)= "+y);
		}else if (x<=1 && x>=-1) {
			y=1;
			System.out.println("F(x)= "+y);
		}else if (x<=4 && x>1) {
			y=-0.5*x2+2*x-1;
			System.out.println("F(x)= "+y);
		}else{
			System.out.println("Funktion ist nicht definiert");
		}
	}
}