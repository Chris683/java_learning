package writtentest;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-14-20:43
 */
public class xingye {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        sort(str);

        for (int i = 0; i < str.length-1; i++) {
            System.out.print(str[i]);
            System.out.print(" ");
        }
        System.out.print(str[str.length-1]);
    }

    public static String[] sort(String[] str){
        for (int i = 0; i <str.length-1 ; i++) {
            for (int j =i+1; j <str.length ; j++) {
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;

    }
}
