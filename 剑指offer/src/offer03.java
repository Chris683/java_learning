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
        Arrays.sort(nums);                       // 排序
        int i;
        for(i=0; i < nums.length-1; i++){        // 从小到大，依次寻找
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
}


// 方法2 时间O(n)，空间O（n）
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int arr[] = new int[nums.length];              // 新建一个数组
        for(int i=0; i<nums.length; i++){              // 充分应用到“数组 nums 里的所有数字都在 0～n-1 的范围内”
            arr[nums[i]]++;
            if(arr[nums[i]]>1)
                return nums[i];
        }
        return -1;
    }
}

