package Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-06-25-15:01
 */

// 二分查找
public class DichotomousSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-12, 12, 13, 17, 19, 20, 52, 75, 123};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int number = scan.nextInt();
        Arrays.sort(arr);
        int a = rank(number,arr);
        System.out.println(a);

    }
    public static int rank(int number,int[] arr){
        int head = 0;
        int end = arr.length-1;
        int mid;
        boolean isFlag = true;
        while (head <= end){
            mid = (head + end)/2;
            if (number == arr[mid]){
                System.out.println("找到指定的元素，位置在："+ mid);
                isFlag = false;
                return mid;
            }else if(number<arr[mid]){
                end = mid-1;
            }else{
                head = mid + 1;
            }
        }
        if (isFlag){
            System.out.println("没有找到指定元素");

        }
        return -1;
    }

}
