import java.util.Scanner;
public class Loeschen_von_Elementen{
	public static int search(int [] a,int value){
		for (int i=0;i<a.length;i++) {
			if (value==a[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void delElement(int[] a, int w){
		int d=search(a,w);
		for (int k=d;k<a.length-1;k++) {
			a[k]=a[k+1];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[]{3, 4, 1, 9 ,-5, 4};
		System.out.print("Feld : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.print("\nzu loeschendes Element: ");
		int p1=sc.nextInt();
		delElement(arr,p1);
		System.out.print("neues Feld : ");
		for (int j=0;j<((arr.length)-1) ;j++ ) {
			System.out.print(arr[j]+" ");
		}
	}
}