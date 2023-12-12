class patient{
	private String name,krankenheit;
	private int aelter;
	public patient(String n, String k, int a){
		this.name = n;
		this.krankenheit = k;
		this.aelter = a;
	}
	public void anzeige(){
		System.out.println(this.name +" hat "+this.krankenheit+" und "+this.aelter+" Jahre alt");
	}
}
class AppPatient{
	public static void main(String[] args) {
		patient p1 = new patient("Herr Mueller","eine Erkaeltung",18);
		patient p2 = new patient("Frau Floesche","Diabetes",52);
		p1.anzeige();
		p2.anzeige();
	}
}