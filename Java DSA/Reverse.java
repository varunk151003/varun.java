import java.util.ArrayList;

public class Reverse {

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
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            ls.add(i);
        }

        System.out.println("Before Swapping the values are : "+ls);
        reverse(ls,0,ls.size()-1);
        System.out.println("After swapping the values are : "+ls);
    }

    
}