class buch{
	private String ISBN,Titel;
	private double preis;
	public buch(String i, String t, double p){
		this.ISBN = i;
		this.Titel = t;
		this.preis = p;
	}
	public void setPreis(double p){
		this.preis = p;
	}
	public String toString(){
		return  
			"ISBN : "+this.ISBN+"\n"+
			"Titel : "+this.Titel+"\n"+
			"Preis : "+this.preis+"\n";
	}
}
class autor{
	private String Name,Synonym;
	private double Gage;
	public autor(String n, String s, double g){
		this.Name = n;
		this.Synonym = s;
		this.Gage = g;
	}
	public void setName(String n){
		this.Name = n;
	}
	public String toString(){
		return  
			"Name : "+this.Name+"\n"+
			"Synonym : "+this.Synonym+"\n"+
			"Gage : "+this.Gage+"\n";
	}
}
class AppBuch{
	public static void main(String[] args) {
		buch b = new buch("0789654", "HTML & CSS", 12);
		autor a = new autor("name", "JM", 170);
		b.setPreis(18);
		a.setName("Jean Michelle");
		System.out.println(b.toString());
		System.out.println(a.toString());
	}
}

