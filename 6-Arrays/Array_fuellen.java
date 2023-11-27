class Array_fuellen{
	public static void main(String[] args){
		int [] arr1 = new int[10];
		int [] arr2 = new int[10];
		int [] arr3 = new int[10];
		
		int i,a;
		int j=0;
		int s=0;
		int min = 1;
		int max = 100;
		
		for (i=0;i<arr1.length;i++ ) {
			arr1[i]=(min + (int) (Math.random() * ((max - min) + 1)))*2;
		}
		
		for (i=0;i<arr2.length;i++ ) {
			arr2[i]=min + (int) (Math.random() * ((max - min) + 1));
			if(arr2[i]<min){
				arr2[i]=min;
			}
			min=arr2[i];
		}
		for (i=0;i<arr3.length;i++ ) {
			arr3[i]=min + (int) (Math.random() * ((max - min) + 1));
			
			if(arr3[i]>max){
				arr3[i]=max;
			}
			max=arr3[i];
		}

		System.out.println("Feld 1");
		for (i=0;i<arr1.length;i++ ) {
			System.out.println("zahl ("+(i+1)+") ="+arr1[i]);
		}
		
		System.out.println("\t");
		System.out.println("Feld 2");
		for (i=0;i<arr2.length;i++ ) {
			System.out.println("zahl ("+(i+1)+") ="+arr2[i]);
		}
		System.out.println("\t");
		System.out.println("Feld 3");
		for (i=0;i<arr3.length;i++ ) {
			System.out.println("zahl ("+(i+1)+") ="+arr3[i]);
		}
	}
}