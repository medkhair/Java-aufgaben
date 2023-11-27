import java.util.Scanner;
class lineare_Gleichung{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x,y,a,b;
		System.out.println("wir wollen diese lineare Gleichung loesen : Y=aX+b");
		System.out.print("Geben Sie den wert von Y : ");
		y=s.nextDouble();
		System.out.print("Geben Sie den wert von a : ");
		a=s.nextDouble();
		System.out.print("Geben Sie den wert von b : ");
		b=s.nextDouble();
		if(a==0){
			System.out.println("keine loesung weil a=0");
		}else{
			x=(y-b)/a;
			System.out.println("diese Gleichung hat eine loesung x = "+x);

		}
		s.close();
	}

}