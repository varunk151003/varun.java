import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotation {

    static void reverse(ArrayList<Integer> list, int start, int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> ls = new ArrayList<Integer>();


        for(int i=0;i<10;i++){
            ls.add(i);
        }

        
        System.out.println("Enter the number of Rotations : ");
        int k = sc.nextInt();

        System.out.println("Before Swapping the values are : "+ls);
        reverse(ls, ls.size()-k,ls.size()-1 );
        System.out.println(ls);

        reverse(ls,0,ls.size()-k-1);
        System.out.println(ls);

        reverse(ls,0,ls.size()-1);
        System.out.println(ls);

        sc.close();
    }

    
}