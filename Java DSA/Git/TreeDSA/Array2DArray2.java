package Git.TreeDSA;

import java.util.ArrayList;
import java.util.List;

class Array2DArray2 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int n : nums){
            if (freq[n] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(freq[n]).add(n);
            freq[n]++;
        }
        return ans;       
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 2, 3, 3, 3};
        Array2DArray2 solution = new Array2DArray2();
        List<List<Integer>> result = solution.findMatrix(v);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}