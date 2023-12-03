import java.util.Scanner;
class Rotieren{
	public static String rotateString(String s, int r){
		int i,j,k;
		int sk=0;
		char[] c = s.toCharArray();
		char[] temp = new char[c.length];
		if (r>0) {
			for (k=(c.length)-r;k<(c.length);k++) {
				temp[sk]=c[k % c.length];
				sk += 1;
			}
			for (j=0;j<(c.length)-r;j++) {
				c[j+r]=c[j];
			}
			for (i=0;i<r;i++) {
				c[i]=temp[i];
			}
		}
		if (r<0) {
			r=r*(-1);
			for (k=0;k<r;k++) {
				temp[k]=c[k];
			}
			for (j=0;j<(c.length)-r;j++) {
				c[j]=c[j+r];
			}
			for (i=(c.length)-r;i<c.length;i++) {
				c[i]=temp[sk];
				sk += 1;
			}
		}
		String s1=new String(c);
		return s1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein wort ein : ");
		String s = sc.nextLine();
		String s1=s;
		System.out.print("Geben Sie ein Parameter ein : ");
		int r = sc.nextInt();
		String s2=rotateString(s,r);
		System.out.println(s1+" => "+s2);
	}
}