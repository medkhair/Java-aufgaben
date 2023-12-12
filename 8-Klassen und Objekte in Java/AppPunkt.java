class punkt{
	public double x,y;
	public punkt(double x, double y){
		this.x=x;
		this.y=y;
	}
	public void an(){
		System.out.println("X : "+this.x);
		System.out.println("Y : "+this.y);
	}
	public void Punkt_Urspung(){
		double d = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
		System.out.println("Abstand des Punktes zum Ursprung ist : "+d);
	}
	public void SpielungsX(){
		System.out.println("Spiegelung des Punktes an der X-Achse ist : ");
		System.out.println("X : "+(this.x));
		System.out.println("Y : "+(this.y*-1));
	}
	public void SpielungsY(){
		System.out.println("Spiegelung des Punktes an der Y-Achse ist : ");
		System.out.println("X : "+(this.x*-1));
		System.out.println("Y : "+(this.y));
	}
	public void SpielungsU(){
		System.out.println("Spiegelung des Punktes an der X-Achse ist : ");
		System.out.println("X : "+(this.x*-1));
		System.out.println("Y : "+(this.y*-1));
	}
	public void Abstand(punkt a){
		double x = a.x;
		double y = a.y;
		double d = Math.sqrt(Math.pow(Math.abs(this.x-x),2)+Math.pow(Math.abs(this.y-y),2));
		System.out.print("Abstand es Punktes zu dem anderen Punkt : "+d);
	}
}
class AppPunkt{
	public static void main(String[] args) {
		punkt p = new punkt(3,5);
		p.an();
		p.Punkt_Urspung();
		p.SpielungsX();
		p.SpielungsY();
		p.SpielungsU();
		punkt p2 = new punkt(8,17);
		p.Abstand(p2);
	}
}