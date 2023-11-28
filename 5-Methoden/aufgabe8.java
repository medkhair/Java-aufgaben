import java.util.Scanner;
 
public class aufgabe8{
 
    public static int wandleBinInDec(int b) {
        int i=0;
        int j=0;
        do{
            int c=(int) Math.floor((b%10)*Math.pow(2,j));
            i=i+c;
            b=b/10;
            j++;
        }while(b!=0);
        return i;
    }
    public static int wandleDecInBin(int b) {
        int i=0;
        int j=0;
        do{
            int c=(int) Math.floor((b%2)*Math.pow(10,j));
            i=i+c;
            b=b/2;
            j++;
        }while(b!=0);
        return i;
    }
 
    public static void main(String[] args) {
        int binaer, dezimal;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Geben Sie eine Binaerzahl ein: ");
        binaer = sc.nextInt();
 
        dezimal = wandleBinInDec(binaer);
        System.out.println("Deziamlzahl: " + dezimal);

        System.out.print("Geben Sie eine Deziamlzahl ein: ");
        dezimal = sc.nextInt();

        binaer = wandleDecInBin(dezimal);
        System.out.println("Binaerzahl: " + binaer);
    }
}