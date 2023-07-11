package writtentest;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-09-08-18:39
 */
public class xiaomi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String s = sameString(str1,str2);
        System.out.println(s.length());

    }

    public static String sameString(String str1,String str2){
        String longStr;
        String lowStr;
        if(str1.length()>=str2.length()){
            longStr = str1;
            lowStr = str2;
        }else{
            longStr = str2;
            lowStr = str1;
        }

        if(longStr.contains(lowStr)){
            return lowStr;
        }

        String same ="";
        for(int i =0;i<lowStr.length();i++){
            if (same.length()>=lowStr.length()-i){
                return same;
            }
            for (int j = i+1; j <lowStr.length()+1 ; j++) {
                if(longStr.contains(lowStr.substring(i,j))){
                    if(lowStr.substring(i,j).length()>same.length()){
                        same = longStr.substring(i,j);
                    }else {
                        break;
                    }
                }
            }
        }
        return same;
    }
}
