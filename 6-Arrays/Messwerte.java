class Messwerte{
	public static void main(String[] args) {
		int[] arr = new int[1000];
		int[] fr = new int[12];
		int a;
		int minA = 1;
		int maxA = 12;
		for (int i=0;i<1000;i++) {
			arr[i] = minA+ (int) (Math.random()*(maxA-minA)+1);
			System.out.println("werte nummer "+(i+1)+" ist : "+arr[i]+" v");
		}
		for (int i=0; i<100; i++) {
            fr[arr[i]-1]++;
        }
        for (int i=0;i<12;i++) {
        	 System.out.println((i+1) + "V: " + fr[i] + " Mal");
        }
	}
}