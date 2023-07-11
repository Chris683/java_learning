package input;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-15:53
 */
public class input1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine())-1;
        System.out.println(count);
        int[][] num = new int[count][2];
        for (int i=0;i<count;i++){
            String temp = in.nextLine();
            String[] ss = temp.trim().split(" ");
            num[i][0] = Integer.parseInt(ss[0]);
            num[i][1] = Integer.parseInt(ss[1]);
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.printf(num[i][j]+" ");

            }
            System.out.println();

        }
    }
}
