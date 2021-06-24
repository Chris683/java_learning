/**
 * @author Chris
 * @create 2021-06-24-21:46
 */

import java.util.Arrays;

/**3 数组中重复的数字
 *在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重
 *复了几次。请找出数组中任意一个重复的数字。
 *
 *示例
 *输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * */

// 方法1  时间O(nlogn)了，空间O(1)
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
}


// 方法2 时间O(n)，空间O（n）
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>1)
                return nums[i];
        }
        return -1;
    }
}

