import java.util.Scanner;
class aufgabe5{
	public static void x(String s){
		char[] c = s.toCharArray();
		int k=0;
		for (int i=(c.length)-1;i>0;i--) {
			if ((c[i]=='x' )||( c[i]=='X') ) {
				c[i]=c[i-1];
				k++;
			}
		}
		if ((c[c.length - 1] == 'x') || (c[c.length - 1] == 'X')) {
            c[c.length - 1] = ' ';
        }
		for (int j=0;j<(c.length)-k+1;j++) {
			System.out.print(c[j]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein String ein : ");
		String s=sc.nextLine();
		x(s);
	}
}