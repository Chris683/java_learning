package sort;

/**
 * @author Chris
 * @create 2021-07-01-22:05
 */
/**
 * @author Chris
 * @create 2021-06-25-16:33
 */
public class QuickSort {
    // 交换函数
    private static void swap(int[] data, int i, int j){
        int temp1 = data[i];
        data[i] = data[j];
        data[j] = temp1;
    }
    // 快排函数
    private static void quickSort(int[] data, int start, int end) {
        if (start>end)                                                 // 输入错误返回
            return;
        int dat = data[start];
        int low = start;
        int high = end;
        while(low<high){
            while (dat <= data[high] && low < high){               // data[start]表示基准位
                high--;
            }
            while (dat>= data[low] && low < high){
                low++;
            }
            if (low<high)
                swap(data, low, high);
        }
        swap(data, start, high);
        quickSort(data, start, high-1);                               // 递归调用
        quickSort(data, high+1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,0,9,8,7,4,4,2,1};
        quickSort(arr,0, arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

