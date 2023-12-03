import java.util.Scanner;
class aufgabe3{
    public static String gross(String s) {
        StringBuilder result = new StringBuilder(s);
        if (s.length() >= 3) {
            for (int i = s.length() - 1; i >= s.length() - 3; i--) {
                result.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        } else {
            result.setCharAt(s.length() - 1, Character.toUpperCase(s.charAt(s.length() - 1)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, s1;
        System.out.print("Geben Sie ein Wort ein: ");
        s = sc.nextLine();
        s1 = s;
        s = gross(s);
        System.out.println(s1 + " => " + s);
    }
}