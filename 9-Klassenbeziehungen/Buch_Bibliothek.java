class bibliothek{
	private String name, adresse;
	public static int anzahl;
	public buch[] b ;

	public bibliothek(String n, String ad, int an){
		this.name = n;
		this.adresse = ad;
		this.anzahl = an;
		b = new buch[an];
		for (int i = 0; i < an; i++) {
            b[i] = new buch("", "", "");
        }
	}
	public void bu(String ti, String sb, String au, int i){
		if (b != null && i >= 0 && i < b.length) {
            b[i].setTitel(ti);
            b[i].setIsbn(sb);
            b[i].setAutor(au);
        } else {
            System.out.println("geht nicht");
        }
	}
	public void ausgabe() {
        System.out.println("name : " + name);
        System.out.println("Adresse : " + adresse);
        System.out.println("Buecher : " + anzahl);
        System.out.println("Buecher in der bibliothek : ");
        for (int i = 0; i < anzahl; i++) {
            System.out.println("\n"+b[i].toString());
        }
    }
}
class buch{
	private String ISBN,Titel,Autor,Standort;
	public buch(String i, String t, String a){
		this.ISBN = i;
		this.Titel = t;
		this.Autor = a;
	}
	public void setIsbn(String i){
		this.ISBN = i;
	}
	public void setTitel(String t){
		this.Titel = t;
	}
	public void setAutor(String a){
		this.Autor = a;
	}
	public void setStandort(String s){
		this.Standort = s;
	}
	public String toString(){
		return 
			"Titel : "+this.Titel+"\n"+
			"Autor : "+this.Autor+"\n";
	}
}
class AppBuch2{
	public static void main(String[] args) {
		String ee = "v";
		buch b = new buch(ee, ee, ee);
		b.setTitel("die Galaxis");
		b.setAutor("Douglas Adams");
		b.setIsbn("3453209613");
		b.setStandort("SY-12-34");
		System.out.println(b.toString());
	}
}
class AppBibliothek{
	public static void delElement(buch[] a, int d){
		for (int k=d;k<a.length-1;k++) {
			a[k]=a[k+1];
		}
		System.out.println("--------------------------------");
		System.out.println("nach der Loechung");
		System.out.println("--------------------------------");
		for (int j=0;j<((a.length)-1) ;j++ ) {
			System.out.print("\n"+a[j]+" ");
		}
	}
	public static void AddElement(buch[] a, int d){
        int newSize = a.length + d ;
        buch[] newArray = new buch[newSize];
        System.arraycopy(a, 0, newArray, 0, a.length);
        newArray[newSize-3] = new buch("02554848", "Ibrahimovic", "Zlatan");
        newArray[newSize-2] = new buch("80557734", "The rich dad", "Someone");
        System.out.println("--------------------------------");
        System.out.println("\n Nach der Ergaenzung:");
        System.out.println("--------------------------------");
        for (int j = 0; j < (newArray.length); j++) {
        	System.out.print("\n"+newArray[j]+" ");
        }
	}
	public static void main(String[] args) {
		bibliothek bib = new bibliothek("Sobhi","Hana 2",3);
		bib.bu("die Galaxis","3453209613","Douglas Adams",0);
		bib.bu("Html & CSS","152656568","Jean Michelle",1);
		bib.bu("Le dernier jour d'un condamne","87964895","Victor Hugo",2);
		bib.ausgabe();
		delElement(bib.b, 1);
		bibliothek.anzahl = bibliothek.anzahl-1;
		AddElement(bib.b, 2);
	}
}