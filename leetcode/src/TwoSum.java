/**
 * @author Chris
 * @create 2021-06-24-17:58
 */

/** 1 两数之和
 * 给定一个整数数组nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 * */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int twoSum;
        int i;
        int j;
        for(i=0; i<nums.length-1;i++)
            for(j=i+1;j<nums.length;j++)
                if(target==nums[i] + nums[j])
                    return new int[] {i,j};
        return new int[] {};
    }
}