import java.util.Scanner;
class aufgabe2{
	public static int quersumme(int a){
		int s=0;
		int r;
		do{
			r=a%10;
			s+=r;
			a=a/10;
		}while(a!=0);
		return s;
	}
	public static int Anzahl_der_Ziffern(int a){
		int s=0;
		int r;
		do{
			a=a/10;
			s+=1;
		}while(a!=0);
		return s;
	}
	//Rekursion
	public static int fak(int a){
		if(a==0){
            return 1;
		}
        else{
            return a*fak(a-1);
        }
    }
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Geben sie eine Zahl : ");
		int a=s.nextInt();
		System.out.println("die Quersumme ist : "+quersumme(a));
		System.out.println("die Anzahl der Ziffern der Zahl ist : "+Anzahl_der_Ziffern(a));
		System.out.println("die Fakultät der Zahl ist : "+fak(a));
	}
}