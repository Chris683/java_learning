package search;

/**
 * @author Chris
 * @create 2021-08-14-13:47
 */
public class BinarySearch {
    public static void main(String[] args) {
        //int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };


        //
		int resIndex = binarySearch(arr, 0, arr.length - 1, 8);
		int in = binarySearch2(arr,8);
		System.out.println("resIndex=" + resIndex);
        System.out.println(in);

//        List<Integer> resIndexList = binarySearch2(arr, 0, arr.length - 1, 1);
//        System.out.println("resIndexList=" + resIndexList);
    }



    // 二分查找算法
    /**
     *
     * @param arr
     *            数组
     * @param left
     *            左边的索引
     * @param right
     *            右边的索引
     * @param findVal
     *            要查找的值
     * @return 如果找到就返回下标，如果没有找到，就返回 -1
     */
    // 递归方法
    public static int binarySearch(int[] arr, int left, int right, int findVal){
        if (left>right){
            return -1;
        }
        int mid = (left+right)/2;
        int midVal = arr[mid];
        if (midVal>findVal){
            return binarySearch(arr,left,mid-1,findVal);
        }else if (midVal<findVal){
            return binarySearch(arr,mid+1,right,findVal);
        }else {
            return mid;
        }
    }


    // 非递归方法
    public static int binarySearch2(int[] arr, int findVal){
        int head = 0;
        int end = arr.length-1;
        int mid;
        while (head<=end){
            mid = (head+end)/2;
            if (arr[mid] == findVal){
                return mid;
            }else if(arr[mid]>findVal){
                end =mid-1;
            }else {
                head = mid+1;
            }
        }
        return -1;
    }


}
