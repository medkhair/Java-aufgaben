import java.util.Scanner;
class aufgabe5{
	public static void x(String s){
		char x1=s.charAt(0);
		char x2=s.charAt(s.length()-1);
		String s1=s.substring(1, s.length() - 1).replaceAll("x", "");
		String s2=s1.replaceAll("X","");
		System.out.println(s+" => "+(x1+s2+x2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein String ein : ");
		String s=sc.nextLine();
		x(s);
	}
}