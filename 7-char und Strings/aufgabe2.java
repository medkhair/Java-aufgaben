import java.util.Scanner;
class aufgabe2{
	public static void istCharInString(String s, char c){
		int k=0;
		for (int i=0;i<s.length();i++) {
			if (c==s.charAt(i)){
				k++;
			}
		}
		if (k>=1) {
			System.out.println(c+" ist in "+"''"+s+"'' "+k+"x enthalen ");
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