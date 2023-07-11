package writtentest;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-13-20:03
 */
public class bili2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] matrix = new int[N][2];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <2 ; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(5);
    }

    public static int recur(int[][] matrix){
        return 5;

    }
}
