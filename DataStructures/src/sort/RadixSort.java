package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Chris
 * @create 2021-08-14-11:18
 */
public class RadixSort {
    public static void main(String[] args) {
        //int arr[] = { 53, 3, 542, 748, 14, 214};

        // 80000000 * 11 * 4 / 1024 / 1024 / 1024 =3.3G
		int[] arr = new int[800];
		for (int i = 0; i < 800; i++) {
			arr[i] = (int) (Math.random() * 800); // 生成一个[0, 8000000) 数
		}
        System.out.println("排序前");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        radixSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);

        System.out.println("基数排序后 " + Arrays.toString(arr));

    }


    //基数排序方法
    public static void radixSort(int[] arr){

        // 找出最大数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

        //最大数的长度
        int maxLength = (max+"").length();

        // 定义桶
        int[][] bucket = new int[10][arr.length];

        // 定义每个桶的中数据多少，用于取数据。
        int[] bucketElementCounts = new int[10];

        //
        for (int i = 0,n=1; i <maxLength ; i++,n*=10) {
            // 数据放入桶中
            for (int j = 0; j < arr.length; j++) {
                //
                int digitOfElement = arr[j]/n%10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            // 从桶中取数据
            int index = 0;

            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k]!=0){
                    for (int l = 0; l <bucketElementCounts[k] ; l++) {
                        arr[index] = bucket[k][l];
                        index++;
                    }
                }
                bucketElementCounts[k] = 0;
            }



        }
    }
}
