import java.util.Scanner;
class Sternchen {
 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("1. Zahl: ");
    int a = s.nextInt();
     
    System.out.print("2. Zahl: ");
    int b = s.nextInt();
     
    System.out.println();
     
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= b; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\t");
    for (int i = 1; i <= b; i++) {
      for (int j = 1; j <= a; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\t");
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\t");
    for (int i = 1; i <= b; i++) {
      for (int j = i; j <= a; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\t");
    
  }
}