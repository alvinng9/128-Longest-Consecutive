package org.example;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int here = nums[i];
            int count = 1;
            while(set.contains(--here)) {
                count++;
                set.remove(here);
            }
            here = nums[i];
            while(set.contains(++here)) {
                count++;
                set.remove(here);
            }
            result = Math.max(count, result);
        }
        return result;
    }
}
