import java.util.Scanner;
class aufgabe1{
	public static void main(String[] args) {
		int i;
		for (i=0;i<=10 ;i++ ) {
			System.out.print(i+",");
		}
		System.out.println(" \n -------------------------");
		for (i=-10;i<=10 ;i++ ) {
			if (i%2==0) {
				if (i<0) {
					System.out.print(i+",");
			    }else{
			    	System.out.print("+"+i+",");
			    }
			}
		}
		System.out.println(" \n -------------------------");
		int b=0;
		for (i=0;i<=20 ;i++ ) {
			if (i%2 != 0 || i==0) {
				b=b+i;
				System.out.print(b+",");
			}
		}
		System.out.println(" \n -------------------------");
		int c=1;
		for (i=1;i<=8 ;i++ ) {
			System.out.print(c+",");
			c=c+c;
		}
		System.out.println(" \n -------------------------");
		int a=0;
		for (i=1;a<100;i++) {
			System.out.print(a+",");
			a=a+i;
		}
		System.out.println(" \n -------------------------");
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie den wert von a :");
		a = s.nextInt();
		System.out.print("Geben Sie den wert von b :");
		b = s.nextInt();
		System.out.print("Geben Sie den wert von s (schrittweite) :");
		int k;
		k = s.nextInt();
		if (a<b) {
			int f=a;
			for (i=f;f<=b;i++) {
				System.out.print(f+",");
				f=i+k;
			}
			
		}else if (b<a) {
			int f=a;
			do{
				System.out.print(f+",");
				f=f-k+1;
				f--;
			}while(f>=b);
		}
		System.out.println(" \n -------------------------");
	}
}