package com.leetcode.lxh.s;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lxh
 * 两数之和
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sums = solution.twoSum(new int[]{6, 7, 3, 4, 8, 1},12);
        System.out.println(Arrays.toString(sums));
    }
    public int[] twoSum(int[] nums,int target) {
        int len = nums.length;
        Map<Integer,Integer> hash = new HashMap<>(len-1);
        for(int i = 0; i < nums.length; ++i){
            if(hash.containsKey(target - nums[i])){
                return new int[]{hash.get(target - nums[i]),i};
            }else{
                hash.put(nums[i],i);
            }
        }
        return nums;
    }
}
