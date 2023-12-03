import java.util.Scanner;
class aufgabe4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie erste Zeichen ein : ");
		char c1 = sc.next().charAt(0);
		System.out.print("Geben Sie zweite Zeichen ein : ");
		char c2 = sc.next().charAt(0);
		System.out.print("Geben Sie dritte Zeichen ein : ");
		char c3 = sc.next().charAt(0);
		System.out.println("Alle möglichen Kombinationen: ");
		System.out.println(c1 + " " + c2 + " " + c3);
        System.out.println(c1 + " " + c3 + " " + c2);
        System.out.println(c2 + " " + c1 + " " + c3);
        System.out.println(c2 + " " + c3 + " " + c1);
        System.out.println(c3 + " " + c1 + " " + c2);
        System.out.println(c3 + " " + c2 + " " + c1);
    }
}