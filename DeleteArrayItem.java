package DataStructureofArray;

public class DeleteArrayItem {
    public static void main(String[] args) {
        int [] A = {2,6,4,9,5,10,3};
        System.out.println("Original Array");
        for (int i = 0; i < A.length; i++) {
             System.out.print(A[i]+ " ");
        }
        System.out.println();
        sort(A);
       
    }

    private static void sort(int[] a) {
        for (int i = 1; i < a.length; i+=1) {
            int x = a[i];
            for (int j = 1; j >0 && x < a[j-1]; j-=1) {
                a[j] =a[j-1];
                a[j] = x;
                //System.out.println(x);
            }
         System.out.print(a[i] + " ");      
        }
    
        
    }
}
