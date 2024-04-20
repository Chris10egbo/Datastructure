package DataStructureofArray;

public class DeleteMethod {
    public static void main(String[] args) {
        int [] list ={1,3,5,10,7};
        //int k =3;
        //int k =3;
        System.out.println("Original elements");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        // delete an item from index
         int [] mylist = deleteArray(list,3); 
         System.out.println("Deleted Array");
         for (int i : mylist) {
            System.out.print(i + " ");
         }       

    }

    private static int[] deleteArray(int[] list, int j) {
        
        int n = list.length;
        while (j<n) {
            list[j-1]=list[j];
            j++;
        }
        n=n-1;
        int [] newlist = new int[n];
        for (int i = 0; i < n; i++) {
            //System.out.print(list[i] + " ");
            newlist[i]=list[i];
        }
        return newlist;
        
    }
}
