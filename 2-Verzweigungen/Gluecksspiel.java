import java.lang.Math;
class Gluecksspiel{
	public static void main(String[] args) {
		double zufall = Math.random();
		double g = 0.39;
		if (zufall < g){
			System.out.println("Gewonnen !");
		}else{
			System.out.println("Verloren");
		}
		
	}
}