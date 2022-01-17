package easy;

import java.util.*;
// leetcode link
// https://leetcode.com/problems/two-sum/submissions/
public class TwoSum {
    //O(n) time || O(n) where n is the number of elements in the array
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> mem = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            int diff = target-nums[i];
            if(mem.containsKey(diff))
                return new int[]{mem.get(diff), i};
            else
                mem.put(nums[i], i);
        }
        return new int[]{};
    }
}
