package writtentest;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-01-20:29
 */
public class minh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int k = in.nextInt();
            in.nextLine();
            String[][] str = new String[k][3];
            for (int i = 0; i <k ; i++) {
                String[] str1 = in.nextLine().split(" ");
                str[i][0] = str1[0];
                str[i][1] = str1[1];
                str[i][2] = str1[2];
            }
            String str2 = in.nextLine();
            //System.out.println(str[0][1]);
            String[] arr = new String[k+5];
            int a = 0;
            for (int i = 0; i <k ; i++) {
                if (str2.equals(str[i][2])){
                    arr[a] = str[i][0];
                    a++;
                }
            }


            for (int i = 0; i <k ; i++) {
                if (arr[i]!=null){
                    System.out.println(arr[i]);
                }
            }
        }

    }

}
