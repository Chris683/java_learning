package offer;

/**
 * @author Chris
 * @create 2021-08-27-12:29
 */
/*
* 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。



示例：

输入：nums = [1,2,3,4]
输出：[1,3,2,4]
注：[3,1,2,4] 也是正确的答案之一。
* */
public class offer21 {
    public int[] exchange(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            while(nums[low]%2==1 && low<high){
                low++;
            }

            while(nums[high]%2==0 && low<high){
                high--;
            }

            int temp =nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
        return nums;
    }
}
