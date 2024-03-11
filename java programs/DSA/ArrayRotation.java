package DSA;

import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<Integer>();

        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(9);
        ls.add(10);

        long startTime = System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            int temp = ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            ls.addFirst(temp);

        }
        sc.close();

        System.out.println("After "+10000+" Rotations : "+ls);

        

        
        for (Integer val : ls) {
            // Some operation
            
        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Duration: " + duration + " ms");
    

        


 
    
    }
}
