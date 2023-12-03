import java.util.Scanner;
class aufgabe1{
	public static void istCharInString(String s, char c){
		int k=0;
		for (int i=0;i<s.length();i++) {
			if (c==s.charAt(i)){
				k++;
				break;
			}
		}
		if (k==1) {
			System.out.println(c+" ist in "+"''"+s+"''"+" enthalen ");
		}else{
			System.out.println(c+" ist in "+"''"+s+"''"+" nicht enthalen ");
		}
	}
	public static void main(String[] args) {
		String s;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Gib einen Text ein : ");
		s=sc.nextLine();
		System.out.print("Gib ein Zeichen ein : ");
		c=sc.next().charAt(0);
		istCharInString(s,c);
	}
}