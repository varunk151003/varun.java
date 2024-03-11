package Git.TreeDSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findMatrix(int[] v) {
        Map<Integer, Integer> um = new HashMap<>();
        for (int i : v) {
            um.put(i, um.getOrDefault(i, 0) + 1);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while (!um.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : um.entrySet()) {
                int f = entry.getKey();
                int s = entry.getValue();
                temp.add(f);
                s--;
                if (s == 0) {
                    toErase.add(f);
                }
                um.put(f, s);
            }
            ans.add(temp);
            for (int i : toErase) {
                um.remove(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 2, 3, 3, 3};
        Solution solution = new Solution();
        List<List<Integer>> result = solution.findMatrix(v);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

