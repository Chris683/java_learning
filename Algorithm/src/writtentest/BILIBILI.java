package writtentest;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-13-18:49
 */
public class BILIBILI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[][] matrix = new int[M][N];
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j <N ; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int n = in.nextInt();
        int[] temp = recuer(matrix);
        for (int i = 0; i <temp.length-1 ; i++) {
            System.out.print(temp[i]);
            System.out.print(",");
        }
        System.out.println(temp[temp.length-1]);


    }

    public static int[] recuer(int[][] matrix){
        if (matrix == null||matrix.length==0||matrix[0].length==0){
            return new int[0];
        }

        int left =0;
        int right = matrix[0].length;
        int low = 0;
        int high = matrix.length;
        int a = right*high;
        int[] arr = new int[a];
        int b = 0;
        high--;
        right--;

        while (high>=low&&right>=left){
            for (int i = left; i <=right ; i++) {
                arr[b++] = matrix[low][i];
            }
            low++;

            for (int j =low ; j <=high ; j++) {
                arr[b++] = matrix[j][right];
            }
            right--;
            for (int k=right;k>=left&&high>=low;k--){
                arr[b++] = matrix[high][k];
            }
            high--;
            for (int l = high;l>=low&&right>=left;l--){
                arr[b++] = matrix[l][left];
            }
            left++;
        }
        return arr;

    }
}
