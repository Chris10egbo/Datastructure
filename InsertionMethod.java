package DataStructureofArray;

public class InsertionMethod {
    public static void main(String[] args) {
        int []list = {1,3,5,7,8};
        // item to insert in the array
        System.out.println("The Original array elements");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        // method insertion the array to be insert value, m = index,destination
         insertion(list,1,50);
    }

    private static void insertion(int[] list, int m, int k) {
        int n =list.length;
        int j=n;
        n=n+1;
        while (j>=n) {
            list[j]=list[j+1];
            j--;
        }
        list[m]=k;
        int [] newArray = new int[n];
        //System.out.println(Arrays.toString(list));
        System.out.println("The array after insertion");
        for (int i = 0; i< list.length; i++) {
            newArray[i] = list[i];
            System.out.print(newArray[i] + " ");
        }
        
    }
}
