import java.util.Scanner;
class Suche_im_Feld{
	public static int search(int [] a,int value){
		for (int i=0;i<a.length;i++) {
			if (value==a[i]) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"-Geben Sie eine zahl ein : ");
			int b=sc.nextInt();
			arr[i]=b;
		}
		System.out.print("nach welchem wert moechtest du suchen : ");
		int a=sc.nextInt();
		int ergebniss = search(arr,a);
		if (ergebniss != -1) {
			System.out.println("der wert ist im Index nummer "+ ergebniss);
		}else{
			System.out.println("nichts gefunden ");
		}
	}
}
