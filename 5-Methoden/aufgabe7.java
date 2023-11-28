import java.util.Scanner;
public class aufgabe7{
 
  public static double berechneZins(int jahre, double kapital) {
    double zins;
    int i = 1;
    do{
      zins = kapital * 0.05;
      kapital = kapital + zins;
      i++;
    }while(i>=jahre);
 
    return kapital;
  }
  public static void sc(double a,int b){
    Scanner sc = new Scanner(System.in);
     if (a instanceof Integer) {
      a = sc.nextInt();
    } else if (a instanceof Double) {
      a = sc.nextDouble();
    }
}
 
  public static void main(String[] args) {
    double kapital;
    int jahre;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Geben Sie das Startkapital ein (in EU): ");
    kapital = sc.nextDouble();
    System.out.println("Geben Sie die Jahre: ");
    jahre = sc.nextInt();
    kapital = berechneZins(jahre,kapital);
    System.out.println("Das Kapital beträgt " + kapital + "EU");
  }
}