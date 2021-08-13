package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Chris
 * @create 2021-08-13-16:32
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr1 = {101, 34, 119, 1, -1, 89};
        // 创建要给80000个的随机的数组
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }

        System.out.println("插入排序前");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        insertSort(arr); //调用插入排序算法
        insertSort(arr1); //调用插入排序算法

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);

        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));





    }


    //插入排序
    public static void insertSort(int[] arr){
        int temp;
        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j >0; j--) {
//                if (arr[j]<arr[j-1]){
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
            // 优化
            int j =i;
            while (j>0 && (arr[j]<arr[j-1])){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
    }
}
