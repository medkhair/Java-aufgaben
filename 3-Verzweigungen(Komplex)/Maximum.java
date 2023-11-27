import java.util.Scanner;
class Maximum{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie den Wert von a : ");
		double a = s.nextDouble();
		System.out.print("Geben Sie den Wert von b : ");
		double b = s.nextDouble();
		System.out.print("Geben Sie den Wert von c : ");
		double c = s.nextDouble();
		if (a>b && a>c && b>c) {
			System.out.println(a+">"+b+">"+c);
		}else if (a>b && c>b && a>c) {
			System.out.println(a+">"+c+">"+b);
		}else if (b>a && a>c && b>c) {
			System.out.println(b+">"+a+">"+c);
		}else if (b>a && c>a && b>c) {
			System.out.println(b+">"+c+">"+a);
		}else if (c>a && c>b && a>b) {
			System.out.println(c+">"+a+">"+b);
		}else if (b>a && c>b && c>a) {
			System.out.println(c+">"+b+">"+a);
		}else if (a>b && a>c && b==c) {
			System.out.println(a+">"+b+"="+c);
		}else if (b>a && b>c && a==c) {
			System.out.println(b+">"+a+"="+c);
		}else if (c>a && c>b && a==b) {
			System.out.println(c+">"+a+"="+b);
		}else {
			System.out.println(a+"="+b+"="+c);
		}
	}
}