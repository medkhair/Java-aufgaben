import java.util.Scanner;
class aufgabe1{
	
	public static void summe1(double a,double b){
		double s = a+b;
		System.out.println("Die Summe ist "+s);
	}
	public static void produkt1(double a,double b){
		double p = a*b;
		System.out.println("Das Produkt ist "+p);
	}
	public static void quotienten1(double a,double b){
		double q;
		if (a>b) {
			q=a/b;
			System.out.println("der Quotienten ist "+q);
		}else{
			q=b/a;
			System.out.println("der Quotienten ist "+q);
		}
	}
	public static void maximum1(double a,double b){
		if (a>b) {
			System.out.println("das Maximum ist "+a);
		}else if (b<a){
			System.out.println("das Maximum ist "+b);
		}else if(a==b){
			System.out.println("beide zahlen sind gleich");
		}
	}
	public static void mittelwert1(double a,double b){
		double m = (a+b)/2;
		System.out.println("Der Mittelwert ist "+m);
	}
	


	public static double summe(double a,double b){
		double s = a+b;
		return s;
	}
	public static double produkt(double a,double b){
		double p = a*b;
		return p;
	}
	public static double quotienten(double a,double b){
		double q;
		if (a>b) {
			q=a/b;
			return q;
		}else{
			q=b/a;
			return q;
		}
	}
	
	public static double maximum(double a,double b){
		double max=Math.max(a,b);
		return max;
	}
	public static double mittelwert(double a,double b){
		double m =(a+b)/2;
		return m;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b;
		System.out.print("geben Sie eine Zahl a : ");
		a=s.nextDouble();
		System.out.print("geben Sie eine Zahl b : ");
		b=s.nextDouble();
		System.out.println("--------------------------------");
		System.out.println("erster Fall");
		summe1(a,b);
		produkt1(a,b);
		quotienten1(a,b);
		maximum1(a,b);
		mittelwert1(a,b);
		System.out.println("--------------------------------");
		System.out.println("Zweiter Fall");
		System.out.println("Die Summe ist "+summe(a,b));
		System.out.println("Das Produkt ist "+produkt(a,b));
		System.out.println("der Quotienten ist "+quotienten(a,b));
		System.out.println("das Maximum ist "+maximum(a,b));
		System.out.println("Der Mittelwert ist "+mittelwert(a,b));
	}
} 