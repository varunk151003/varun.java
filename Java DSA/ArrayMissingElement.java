import java.util.ArrayList;

public class ArrayMissingElement {
    public static void main(String[] args) {
       
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(7);
        ls.add(5);
        ls.add(3);
        ls.add(9);
        ls.add(19);
        ls.add(17);

        ls.sort(null);
        int max = 20;

        System.out.println("The Missing elements are : ");


        for(int i=1;i<=max;i++){
            if(!ls.contains(i)){
                System.out.print(i +" ");
            }
        }
    }
}
