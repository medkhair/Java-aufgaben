import java.util.Scanner;

class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Wert fuer die erste Kante: ");
        int k1 = scanner.nextInt();

        System.out.print("Geben Sie den Wert fuer die zweite Kante: ");
        int k2 = scanner.nextInt();

        System.out.print("Geben Sie den Wert fuer die Hoehe: ");
        int h = scanner.nextInt();

        int s = 4 * (k1 + k2 + h);
        int o = 2 * (k1 * k2 + k2 * h + h * k1);
        int v = k1 * k2 * h;

        System.out.println("Die Summe der Kanten ist: " + s);
        System.out.println("Die Oberfläche ist: " + o);
        System.out.println("Das Volumen ist: " + v);

        scanner.close(); 
    }
}