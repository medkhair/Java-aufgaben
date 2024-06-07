import java.util.Scanner;
class html{
	static String makeTags(String tag, String content){
		return "<"+tag+">"+content+"</"+tag+">";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein TAG ein : ");
		String  t =  sc.nextLine();
		System.out.print("Geben Sie einen text ein : ");
		String c = sc.nextLine();
		System.out.println(makeTags(t,c));
	}
}