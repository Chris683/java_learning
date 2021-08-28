package offer;

import java.util.Arrays;

/**
 * @author Chris
 * @create 2021-08-28-19:48
 */
 class best1 {
    public static void main(String[] args) {
        int[] people = new int[]{1,3,3,5,33,3,4,7};
        int[] mianbao = new int[]{1,2,};
        int sum = best(people,mianbao);
        System.out.println(sum);
    }

    public static int best(int[] people,int[] miaobao){
        if(people == null || miaobao==null){
            return 0;
        }
        Arrays.sort(people);
        Arrays.sort(miaobao);
        int i=0;
        int j=0;
        int sum=0;
        while (i<people.length&&j< miaobao.length){
            if(miaobao[j]>=people[i]){
                sum++;
                j++;
                i++;
            }else {
                j++;
            }
        }
        return sum;
    }
}
