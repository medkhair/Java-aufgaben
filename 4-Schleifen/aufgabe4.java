class aufgabe4{
	public static void main(String[] args) {
		int total = 0;
		for (int x=1; x<=5;x++) {
			int y = x*x;
			System.out.println(y);
			total =total+y;
		}
		System.out.println("Total ist : " + total);
	}
}