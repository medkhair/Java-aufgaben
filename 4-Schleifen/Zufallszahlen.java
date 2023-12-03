import java.util.Scanner;
class Zufallszahlen{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b;
		int summ=0;
		int i;
		int minA=1000;
		int maxA=9999;
		int a;
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
		System.out.print("Geben Sie Den Anzahl vierstelliger Zufallszahlen ");
		i=s.nextInt();
		for (b=1;b<=i;b++) {
			a = minA + (int) (Math.random() * ((maxA - minA) + 1));
			System.out.println("Zahl nummer "+b+" ist : "+a);
			summ +=a;
			if (a < min) {
                min = a;
            }

            if (a > max) {
                max= a;
            }
		}
		System.out.println(" der Mittelwert ist : "+(summ/b));
		System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

	}
}