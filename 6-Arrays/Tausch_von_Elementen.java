import java.util.Scanner;
class Tausch_von_Elementen{
	public static int search(int [] a,int value){
		for (int i=0;i<a.length;i++) {
			if (value==a[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void swap(int[] a, int i, int j){
		int c=search(a,i);
		int d=search(a,j);
		int e=a[c];
		a[c]=a[d];
		a[d]=e;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[]{4,2,10,3,-5,0,17};
		System.out.print("Feld : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.print("\nParameter 1: ");
		int p1=sc.nextInt();
		System.out.print("Parameter 2: ");
		int p2=sc.nextInt();
		swap(arr,p1,p2);
		System.out.print("neues Feld : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}