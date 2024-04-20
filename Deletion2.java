package DataStructureofArray;

public class Deletion2 {
    public static void main(String[] args) {
        int [] list ={1,3,5,10,7};
        int k =3;
        int n = 5;
        System.out.println("Original elements");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        int j=k;
        //n=n-1;
        while (j<n) {
            list[j-1]=list[j];
            j++;
        }
        n=n-1;
        System.out.println("Array elements after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
