class steurung{
	boolean lampe;
	double st;
	double t;
	String n;
	steurung(boolean l,double st,double t){
		this.lampe = l;
		this.st = st;
		this.t = t;
		this.n = n;
	}
	void status(){
		String y;
		if (this.lampe == true) {
			y = "Eingeschaltet. ";
		}else{
			y = "Ausgeschaltet. ";
		}
		System.out.println(" Status : "+y+" Soll: "+this.st+" °c. ueberwachung laeuft. ");
		System.out.println(" Status : Soll:"+this.st+" °c. ist : "+this.t+" °c.");
	}
	void heizung(){
		int s = 1;
		if (this.t<this.st) {
			System.out.print("-> Achtung zu Kalt! ");
			System.out.println("Heizung an");
			this.lampe=true;
			System.out.println("Lampe an");
			do{
			if (s%2==0) {
				this.t = this.t+1.1;
			}else{
				this.t = this.t+1.8;
			}
			if(this.t<=(this.st+(this.st*0.05))){
				System.out.println(" Status : Soll %:"+this.st+" °c. ist : "+this.t+" °c.");
			}
			s++;
		}while(this.t<(this.st+(this.st*0.05)));
		System.out.println("-> Heizung aus. ");
		this.lampe = false;
		}else if(this.t>(this.st)){
			this.lampe=false;
			System.out.println("Lampe aus");
			System.out.println(" Status : Soll %:"+this.st+" °c. ist : "+this.t+" °c.");
			System.out.print("-> Achtung zu warm! ");
		}
	}
}
class Aquarium{
	public static void main(String[] args) {
		steurung a = new steurung(true,21,19.1);
		a.status();
		a.heizung();
		a.st=20.5;
		a.t=21.9;
		a.status();
		a.heizung();

	}
}