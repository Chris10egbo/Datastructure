package DataStructureofArray;

public class InsertionOfElement {
    public static void main(String[] args) {
        // Ho to insert element in an array
        int []list = {1,3,5,7,8};
        // item to insert in the array
        int item =10;
        // the position or index to insert the item
        int k =2;
        // the array length
        int n =list.length;
        int j=n;
        System.out.println("The Original array elements");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        n=n+1;
        while (j>=n) {
            list[j]=list[j+1];
            j--;
        }
        list[k]=item;
        //System.out.println(Arrays.toString(list));
        System.out.println("The array after insertion");
        for (int i = 0; i< list.length; i++) {
           System.out.print(list[i] + " ");
        }
        //System.out.println(n);
    }

}
