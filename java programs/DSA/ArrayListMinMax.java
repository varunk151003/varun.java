package DSA;

import java.util.*;

public class ArrayListMinMax {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<=10000000L;i++){
            ls.add(i);
        }

        int min=ls.get(0);
        int max=ls.get(ls.size()-1);

        

       for(int i : ls){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
       System.out.println("Maximun value : "+max);
       System.out.println("Minimum value : "+min);

       long startTime = System.currentTimeMillis();

        
        for (Integer i : ls) {
            // Some operation
            
        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Duration: " + duration + " ms");
    



    }
    
}
