import java.util.Scanner;
class Gewicht{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ges,alter,gr,er;
		double gew;
		System.out.println("Geben Sie das Geschlecht ");
		do{
			System.out.print("fuer maener tipp 1 / fuer frauen tipp 0 : ");
			ges=s.nextInt();
		}while(ges!=0 && ges!=1 );
		System.out.print("Geben Sie den Alter : ");
		alter=s.nextInt();
		System.out.print("Geben Sie den Groesse in cm : ");
		gr=s.nextInt();
		System.out.print("Geben Sie den Gewicht in kg : ");
		gew=s.nextDouble();
		er=gr-100;

		if (alter<17 || gr<120){
			System.out.println("Keine Angaben ");
		}else if (ges==1){
			if (gew<=er+(er*0.05) && gew>=er+(er*-1*(0.05))  ) {
				System.out.println("normalgewichtig ");
			}else if(gew>er+(er*0.05)){
				System.out.println(" Uentergewichtig");
			}else{
				System.out.println(" Untergewichtig");
			}
		}else{
			if (gew<=er+(er*0.04) && gew>=er+(er*-1*0.07)  ) {
				System.out.println("normalgewichtig ");
			}else if(gew>er+(er*0.04)){
				System.out.println(" Uentergewichtig");
			}else{
				System.out.println(" Untergewichtig");
			}

		}


	}
}