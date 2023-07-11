package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-10-9:26
 */
public class leetcode215 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while (in.hasNext()){
            String[] str = in.nextLine().replace("[","").replace("]","").split(",");
            int[] arr = new int[str.length-1];
            for (int i = 0; i <str.length-1 ; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int n = Integer.parseInt(str[str.length-1]);

            System.out.println(Arrays.toString(arr));
            System.out.println(n);

            System.out.println(findKthLargest(arr,n));
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        while (true){
            int tar = sort(nums,left,right);
            if (tar==k-1){
                return nums[tar];
            }else if(tar>k-1){
                right = tar-1;
            }else{
                left = tar+1;
            }

        }
    }
    public static int sort(int[] arr,int left,int right){
        int low = left;
        int piov = arr[left];

        while(left<right){
            while (arr[right]<piov&&left<right){
                right--;
            }
            while (arr[left]>=piov&&left<right){
                left++;
            }

            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[left];
        arr[left] = temp;
        return left;
    }
}
