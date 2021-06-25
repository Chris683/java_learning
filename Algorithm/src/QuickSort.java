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
        int low = start;
        int high = end;
        while(low<high){
            while (data[start] < data[high] && low < high){               // data[start]表示基准位
                high--;
            }
            while (data[start] > data[low] && low < high){
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
        int[] arr = new int[]{5,6,0,9,8,7,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
