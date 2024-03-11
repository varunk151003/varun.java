package DSA;

import java.util.ArrayList;

public class Time {
    public static void main(String[] args) {
        
        ArrayList<Integer> ls = new ArrayList<Integer>();

        for(int i=0;i<=10000000L;i++){
            ls.add(i);
        }

        long startTime = System.currentTimeMillis();

        
        for (int val : ls) {
            // Some operation
 
        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Duration: " + duration + " ms");
    
    }
}
