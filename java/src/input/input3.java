package input;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-16:20
 */
public class input3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int[] arr = new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i] = Integer.valueOf(line[i]);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
    }
}
