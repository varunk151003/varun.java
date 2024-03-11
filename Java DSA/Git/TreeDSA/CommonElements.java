package Git.TreeDSA;

import java.util.*;

class CommonElements {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2); // Keep only the common elements in set1

        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] nums2 = {0, 2, 4, 5, 7};
        CommonElements solution = new CommonElements();
        int[] result = solution.findIntersectionValues(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
