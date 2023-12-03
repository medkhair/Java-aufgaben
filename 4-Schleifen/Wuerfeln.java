import java.lang.Math;

class Wuerfeln{
	public static void main(String[] args) {
		int minA=1;
		int maxA=6;
		int wurf;
		int summe=0;
		for (int i=0;i<10 ;i++ ) {
			wurf = minA + (int) (Math.random() * ((maxA - minA) + 1));
			System.out.println((i+1)+"- itteration : "+wurf);
			summe +=wurf;
		}
		System.out.println("Die summe ist : "+summe);
	}
}