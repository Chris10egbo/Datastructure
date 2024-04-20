package DataStructureofArray;

public class Update {
    public static void main(String[] args) {
        int [] list = {1,3,5,7,8};
        int k=3,item=10;
        System.out.println("Original Array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        int n= list.length;
        int j = n;
        n=n+1;
        while (j>=n) {
            list[j]=list[j+1];
            j++;
        }
        list[k]=item;
        System.out.println("Updated Array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        //System.out.println(Arrays.toString(list));
    }
    
    
}
