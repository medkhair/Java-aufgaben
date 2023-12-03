import java.util.Scanner;
class aufgabe6{
	public static void space(String s){
		String s1=s.replaceAll("\\s", "");
		System.out.println(s+" => "+s1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein String ein : ");
		String s=sc.nextLine();
		space(s);
	}
}