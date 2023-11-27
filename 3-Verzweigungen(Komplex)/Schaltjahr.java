import java.util.Scanner;
class Schaltjahr{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int jahr;
		System.out.print("Geben Sie den Jahreszahl ein : ");
		jahr = s.nextInt();
		if(jahr%4 != 0){
			System.out.println("Das ist kein Schaltjahr ");
		}else if(jahr%100 != 0){
			System.out.println("Das ist ein Schaltjahr ");
		}else if(jahr%400 != 0) {
			System.out.println("Das ist kein Schaltjahr ");
		}else{
			System.out.println("Das ist ein Schaltjahr ");
		}
	}
}