class pyramid{
	double h,a,v,o;
	public pyramid(double h,double a){
		this.h = h;
		this.a = a;
	}
}
class quader extends pyramid{
	public quader(double h,double a){
		super(h,a);
		this.v = (a*a*h)/3;
		this.o = a*a + a*Math.sqrt((4*h*h)+(a*a));
	}
}
class Tetraeder extends pyramid{
	public Tetraeder(double h,double a){
		super(h,a);
		this.v =( (a*a*a)/12)*Math.sqrt(2);
		this.o = a*a + Math.sqrt(3);
	}
}
class Kegel extends pyramid{
	double s;
	public Kegel(double h,double a,double s){
		super(h,a);
		this.s = s;
		this.v =a*a*h*(1/3)*Math.PI;
		this.o = a*Math.PI*(a+s);
	}
}
class Pyramiden{
	public static void main(String[] args) {
		quader q = new quader(12,3);
		Tetraeder t = new Tetraeder(12,3);
		Kegel k = new Kegel(12,3,15);
		System.out.println(" 1- Quader oberflaeche = "+q.o+" volumen = "+q.v);
		System.out.println(" 2- Tetraeder oberflaeche = "+t.o+" volumen = "+t.v);
		System.out.println(" 3- Kegel oberflaeche = "+k.o+" volumen = "+k.v);
	}
}
