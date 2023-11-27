import java.util.Scanner;
class ex6{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String n;
		int j1,j2,g,a;
		System.out.print("Hallo, wie heisst du? ");
		n = S.nextLine();
		System.out.print("Welches jahr haben wir, "+ n +"? ");
		j1 = S.nextInt();
		System.out.print("In welchem Jahr bist du geboren , "+ n +"? ");
		j2 = S.nextInt();
		System.out.print("Hattest du dieses jahr schon Geburtstag ? ");
		do{
			System.out.println("fuer ja gebe 0 fuer nein 1  ");
			g = S.nextInt();
		}while(g!=0 && g!=1);
		System.out.println("ein " + g);
		if (g==0) {
			a=j1-j2;
		}else{
			a=j1-j2-1;
		}
		System.out.println(n+" du bist  " + a +" Jahre alt");
		S.close();
	}
}