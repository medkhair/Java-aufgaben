import java.util.Scanner;
class primafaktoren{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,i;
		System.out.print("Geben Sie eine Zahl ein : ");
		a = s.nextInt();
		int e=0;
		for (i=2;i<a;i++) {
			if (a%i==0) {
				do{
					e=e+1;
					a/=i;
				}while(a%i==0);
				if(e>0){
					System.out.print(i);
					System.out.print("^"+e);
					System.out.print(" * "+a);
				}
			}
		}
	}
}