import java.util.Scanner;
class iKauf{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p;
		System.out.print("Gib den Auftragswert an  : ");
		do{
			p=s.nextDouble();
		}while(p<0);
		if (p<100) {
			System.out.println("Sie muessen "+(p+3.50)+" zahlen ");
		}else if(p>=100 && p<200){
			System.out.println("Sie muessen "+p+" zahlen ");
		}else if(p>=200){
			System.out.println("Sie muessen "+(p-(p*0.02))+" zahlen ");
		}
	}
}