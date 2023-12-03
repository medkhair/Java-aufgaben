import java.util.Scanner;
class Passwortgenerator{
	public static void pwdGenerator(String s) {
		String s1 = s+' ';
		char[] c = s1.toCharArray();
		int k=0, j=0, m;
		char[] temp = new char[c.length];
		for (int i=0;i<c.length;i++) {
			k++;
			if (c[i]==' ') {
				j++;
				if (j%2==1) {
					temp[j]=c[i-k+1];
				}else {
					temp[j]=c[i-1];
				}
				k=0;
			}
		}
		System.out.print(j);
		for (m=1;m<j+1;m++) {
			System.out.print(temp[m]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein wort ein : ");
		String s = sc.nextLine();
		String s1=s;
		pwdGenerator(s);
	}
}