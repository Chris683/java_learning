package writtentest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-19:16
 */
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int k = in.nextInt();
            in.nextLine();
            String[] str = in.nextLine().split(" ");
            int[][] arr = new int[k][2];
            for (int i = 0; i <k ; i++) {
                String[] str1 = str[i].split(",");
                arr[i][0] = Integer.parseInt(str1[0]);
                arr[i][1] = Integer.parseInt(str1[1]);
            }
            int num = in.nextInt();
            System.out.println(recur(k,arr,num));
        }

    }

    public static int recur(int k,int[][] arr,int num) {
        int sum=0;

        int[] arr1 = new int[k];
        int[] arr2 = new int[k];
        for (int i = 0; i < k; i++) {
            arr1[i] = arr[i][0];
        }
        for (int j = 0; j < k; j++) {
            arr1[j] = arr[j][0];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (num <= arr1[0]) {
            return num;
        }
        if (k == 1) {
            int a = arr[0][0] + arr[0][1];
            if (num >= a) {
                return a;
            } else {
                return num;
            }
        }
        return arr1[0] + arr2[0];
    }



}