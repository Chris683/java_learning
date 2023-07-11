package writtentest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-08-20:05
 */
public class sanse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i <10 ; i++) {
            String s =in.next();
            arr[i] = Integer.parseInt(s);
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sort(int[] arr){
        int low = 0;
        int high = arr.length-1;
        for (int i = 0; i <high ; i++) {
            if (arr[i]==1){
                int temp = 0;
                temp =arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                low++;
            }

            if(arr[i] == 3){
                int temp = 0;
                temp = arr[high];
                arr[high] = arr[i];
                arr[i] = temp;
                i--;
                high--;
            }
        }
        return arr;
    }

}
