import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();

        ls.add(1);
        ls.add(3);
        ls.add(2);
        ls.add(3);
        ls.add(1);
        ls.add(4);
        ls.add(2);

        System.out.println("Array : "+ls);

        ArrayList<Integer> uniq = new ArrayList<Integer>();
        
        for(int element : ls){
            if(!uniq.contains(element)){
                uniq.add(element);
            }
        }

        System.out.println("Afer removing the Duplicates the array gets modified into : "+uniq);

        
        
    }

       


}

   

    

