import java.util.Scanner;
class aufgabe1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int s=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int pos=0;
		for (int i=0;i<arr.length;i++ ) {
			System.out.print("Geben Sie eine Zahl ein : ");
			int a = sc.nextInt();
			arr [i]=a;
			System.out.println("Arr["+(i+1)+"] = "+arr [i]);
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
		}
		System.out.println("Die Summe ist : "+s);
		System.out.println("Das Maximum ist : "+max);
		System.out.println("Das Minimum ist : "+min);
		System.out.println("Der Mittelwert ist : "+(double)(s/arr.length));
		System.out.println("Anzahl positiver Werte ist : "+pos);
	}
}