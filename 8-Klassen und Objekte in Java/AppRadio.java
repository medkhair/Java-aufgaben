class Radio{
	boolean eingeschaltet;
	int lautstaerke;
	double frequenz;
	 public Radio() {
        this.eingeschaltet = false;
        this.lautstaerke = 0;
        this.frequenz = 99.9;
    }
	Radio(boolean istAn, int lautstaerke, double frequenz){
		this.eingeschaltet = istAn;
		this.lautstaerke = (lautstaerke >= 0 && lautstaerke <= 10) ? lautstaerke : 0;
		this.frequenz = (frequenz >= 85.0 && frequenz <= 110.0) ? frequenz : 99.9;
	}
	void lauter(int r){
		if (this.eingeschaltet == true) {
			if (this.lautstaerke<10 && this.lautstaerke>0) {
				this.lautstaerke += r;
			}
		}else{
			System.out.println("Das Radio ist ausgeschaltet");
		}
	}
	void leiser(int r){
		if (this.eingeschaltet == true) {
			if (this.lautstaerke<10 && this.lautstaerke>0) {
				this.lautstaerke -= r;
			}
		}else{
			System.out.println("Das Radio ist ausgeschaltet");
		}
	}
	void an(){
		if (this.eingeschaltet == false) {
			this.eingeschaltet = true;
		}
	}
	void aus(){
		if (this.eingeschaltet == true) {
			this.eingeschaltet = false;
		}
	}
	public String toString(){
		return "Radio an "+ "\n" +
               "Freq = " + this.frequenz + "\n" +
               "Laut = " + this.lautstaerke + "\n";
    }
    void waehleSender(double frequenz){
    	this.frequenz = frequenz;
    	if (this.frequenz<85 || this.frequenz>110) {
    		this.frequenz = 99.9;
    	}
    }
}
public class AppRadio {
    public static void main(String[] args) {
        Radio r1 = new Radio();
        r1.an();
        r1.lauter(3);
        String k = r1.toString();
        System.out.println(k);
        r1.waehleSender(98.4);
        r1.leiser(2);
        r1.aus();
    }
}