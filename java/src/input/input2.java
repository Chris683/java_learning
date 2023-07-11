package input;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-16:08
 */
public class input2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        System.out.println(count);
        in.nextLine();
        String[] str = new String[count];
        for (int i=0;i<count;i++){
            str[i] = in.nextLine();
        }
        for (int i = 0; i <count ; i++) {
            System.out.println(str[i]);

        }
    }
}
