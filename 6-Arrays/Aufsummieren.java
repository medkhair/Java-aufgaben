public class Aufsummieren {
 
    public static int[] sumUp(int[] a) {
         for (int i=0;i<a.length;i++) {
             if (i>0) {
                 a[i] += a[i-1];
             }
        }
        return a;
    }
 
    public static void main(String[] args) {
        int[] zahlen = {4,3,1,9,-5,4};
        System.out.print("Feld : ");
        for (int i : zahlen) {
            System.out.print(i+" ");
        }
        sumUp(zahlen);
        System.out.print("neues Feld : ");
        for (int j=0;j<(zahlen.length) ;j++ ) {
            System.out.print(zahlen[j]+" ");
        }
    }
}