package algorithmquestions;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-06-25-12:09
 */

/**
 * 把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出：
 * 1 2
 * 4 3
 * 输入数字3，则程序输出：
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 输入数字4， 则程序输出：
 * 1  2  3  4
 * 12 13 14 5
 * 11 16 15 6
 * */
public class RoundNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];
        int count = 0;                            // 要显示的数据
        int maxX = n - 1;                         // x轴的最大下标
        int maxY = n - 1;                         // Y轴的最大下标
        int minX = 0;                             // x轴的最小下标
        int minY = 0;                             // Y轴的最小下标

        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = ++count;
            }
            minY++;

            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;

            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;

            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String space = (arr[i][j] + "").length() == 1 ? "0" : "";
                System.out.print(space + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

