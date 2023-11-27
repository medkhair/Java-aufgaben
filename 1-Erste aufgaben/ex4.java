import java.util.Scanner;
class ex4{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Geben Sie Pro gesendete SMS : ");
		int sms = S.nextInt();
		System.out.print("Geben Sie Pro gesendete  : ");
		int mms = S.nextInt();
		double sm = 5.99 + (sms * 0.19) + (mms * 0.29);
		System.out.println("sie muessen "+ sm +" Euro berechnen");
		S.close();
	}
}