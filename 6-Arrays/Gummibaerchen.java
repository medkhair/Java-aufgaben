import java.util.Scanner; 
class Gummibaerchen{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p;
		do{
			System.out.print("Geben Sie  die Anzahl von Tuetchen ein : ");
			p = sc.nextInt();
		}while(p<=0);
		int s=0;
		int a=0;
		int b=0;
		int [] arr = new int[p];
		for (int i=0;i<arr.length ;i++ ) {
			do{
				System.out.print("Wie viele Gummibaerchen sind in Tuete Nummer "+(i+1)+": ");
				arr[i] = sc.nextInt();
			}while(arr[i]<0);
			if (arr[i]==12) {
				s++;
			}else if (arr[i]<12) {
				a++;
			}else if (arr[i]>12) {
				b++;
			}
		}
		System.out.println("die Anzahl der korrekten Tuetchen ist : "+s);
		System.out.println("die Anzahl der Tuetchen, die zu wenige hatten, ist : "+a);
		System.out.println("die Anzahl der Tuetchen, die zu viele hatten, ist : "+b);
	}
}