import java.util.Scanner;
class positiveZahl{
	public static void main(String[] args) {
		int a,k;
		k=2;
		Scanner s = new Scanner(System.in);
		System.out.print("Gib ein Zahl : ");
		a = s.nextInt();
		if(a<0){
			System.out.println(a +" ist negativ ");
		}else{
			if(a>0){
				System.out.println(a +" ist positiv ");
			}else{
				System.out.println(a +" ist Null ");
			}
		}
		if(a%k ==0){
			System.out.println(a +" ist gerade ");
		}else{
			if(a%k ==1 || a%k ==-1){
				System.out.println(a +" ist ungerade ");
			}
		}
		s.close();


	}
}