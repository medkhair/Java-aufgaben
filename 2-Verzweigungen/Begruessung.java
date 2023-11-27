import java.util.Scanner;
class Begruessung{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,g;
		String n; 
		System.out.print("Wie heissen Sie ? ");
		n = s.nextLine();
		System.out.print("Wie alt sind Sie ? ");
		a = s.nextInt();
		if (a>=18) {
			System.out.println("Geschlecht bitte ? ");
			System.out.print("0 fuer Weiblich / 1 fuer maennlich ");
			do{
			g = s.nextInt();
		    }while(g!=0 && g!=1);
			if (g==0) {
				System.out.println("Guten Tag Frau "+n+" !");
				
			}else{
				System.out.println("Guten Tag Herr "+n+" !");
			}
			
		}else{
			System.out.println("Hallo "+n+" !");
		}



	}
}