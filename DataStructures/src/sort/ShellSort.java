package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Chris
 * @create 2021-08-13-17:08
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr1 = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
        shellSort2(arr1);
        System.out.println(Arrays.toString(arr1));


        // 创建要给80000个的随机的数组
        int[] arr = new int[80000000];
        for (int i = 0; i < 80000000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }

        System.out.println("排序前");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        //shellSort(arr); //交换式
        shellSort2(arr);//移位方式

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);

        //System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr){
        int temp;
        for (int i = arr.length/2; i >0 ; i/=2) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = j-i; k >=0 ; k-=i) {
                    if(arr[k]>arr[k+i]){
                        temp = arr[k];
                        arr[k] = arr[k+i];
                        arr[k+i] = temp;
                    }
                }

            }

        }
    }

    public static void shellSort2(int[] arr){
        int temp;
        for (int i = arr.length/2; i >0 ; i/=2) {
            for (int j = i; j <arr.length ; j++) {
                int k = j-i;
                while (k>=0&&(arr[k]>arr[k+i])){
                    temp = arr[k];
                    arr[k] = arr[k+i];
                    arr[k+i] = temp;
                    k -=i;
                }

            }

        }
    }
}
