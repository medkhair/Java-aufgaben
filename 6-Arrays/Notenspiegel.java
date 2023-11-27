import java.util.Scanner;
class Notenspiegel{
	public static void sternchen(int a){
		for (int i=0;i<a ;i++ ) {
			System.out.print("*");
		}
		System.out.println("\t");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[15];
		int s=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int pos=0;
		int neg=0;
		int i;
		for (i=0;i<arr.length;i++ ) {
			System.out.print("Geben Sie eine Zahl ein : ");
			int a = sc.nextInt();
			arr [i]=a;
			System.out.println("Note["+(i+1)+"] = "+arr [i]);
			s=s+arr[i];
			if (max<arr[i]) {
				max=arr[i];
			}
			if (min>arr[i]) {
				min=arr[i];
			}
			if (arr[i]>0) {
				pos++;
			}
			if (arr[i]<0) {
				neg++;
			}

		}
		System.out.println(" \t ");
		for (i=0;i<arr.length;i++) {
			System.out.println("Note "+(i+1)+" : "+arr[i]);
		}
		System.out.println(" \t ");
		System.out.println("Das Maximum ist : "+max);
		System.out.println("Das Minimum ist : "+min);
		System.out.println("Der Mittelwert ist : "+(double)(s/arr.length));
		System.out.println(" der Anteil negativer Noten ist : "+(double)(neg/arr.length));
		System.out.println(" \t ");
		for (i=0;i<arr.length;i++) {
			System.out.print("Note "+(i+1)+" : ");
			sternchen(arr[i]);
		}
		
	}
}