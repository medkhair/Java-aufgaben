import java.util.Scanner;
 
public class aufgabe9{
 
    public static int wandleSysInDec(int b,int s) {
        int i=0;
        int j=0;
        do{
            int c=(int) Math.floor((b%10)*Math.pow(s,j));
            i=i+c;
            b=b/10;
            j++;
        }while(b!=0);
        return i;
    }
    public static int wandleDecInSys(int b,int s) {
        int i=0;
        int j=0;
        do{
            int c=(int) Math.floor((b%s)*Math.pow(10,j));
            i=i+c;
            b=b/2;
            j++;
        }while(b!=0);
        return i;
    }
 
    public static void main(String[] args) {
        int binaer, dezimal;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Geben Sie das Ausgangszahkensystem ein: ");
        int s1 = sc.nextInt();
        System.out.print("Geben Sie das Zielzahlensystem ein: ");
        int s2 = sc.nextInt();
        System.out.print("Geben Sie die umzuwandelnde Zahl ein: ");
        int zahl = sc.nextInt();
        dezimal = wandleSysInDec(zahl,s1);
        if (s1==10) {
            System.out.println("die umgerechnete Zahl ist: " + wandleDecInSys(zahl,s2));
        }else if(s2==10){
            System.out.println("die umgerechnete Zahl ist: " + dezimal);
        }else{
            int zahl2 = wandleDecInSys(dezimal,s2);
            System.out.println("die umgerechnete Zahl ist: " + zahl2);
        }
    }
}